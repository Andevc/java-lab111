// Burbuja Enteros
package com.mycompany.lab111.arrays;
import java.util.Scanner;
public class e3 {
	static public int a[] = new int[20];
	static public void llenarV(int w){
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=1;i<=w;i++){
				System.out.print("a["+i+"]= ");
				a[i] = sc.nextInt();}
		}}
	
	static public void mostrarV(int w){
		System.out.println("");
		for(int i=1; i<=w; i++){ 
			System.out.print(a[i]+" | ");}}
	
	static public void burbuja(int w){
		int i,j,x;
		for(i=1;i<=w;i++){
			for(j=i+1;j<=w;j++){
				if(a[i]>a[j]){
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
