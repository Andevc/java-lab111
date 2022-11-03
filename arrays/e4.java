// Burbuja Cadenas
package com.mycompany.lab111.arrays;
import java.util.Scanner;
public class e4 {
	static public String a[] = new String[20];
	static public void llenarV(int w){
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=1;i<=w;i++){
				System.out.print("a["+i+"]= ");
				a[i] = sc.next();}
		}}
	
	static public void mostrarV(int w){
		System.out.println("");
		for(int i=1; i<=w; i++){
			System.out.print(a[i]+" | ");}}
	
	static public void burbuja(int w){
		int i,j;
		String x;
		for(i=1;i<=w;i++){
			for(j=i+1;j<=w;j++){
				if(a[i].compareTo(a[j]) > 0 ){
					x=a[i]; a[i] = a[j]; a[j] = x;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("n: ");
			int n = sc.nextInt();
			llenarV(n);
			mostrarV(n); 
			burbuja(n);
			mostrarV(n);
		}
	}

}
