//Metodo de busqueda (Sacudida)
package com.mycompany.lab111.arrays;
import java.util.Scanner;
public class e9 {
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
	static public void sacudida(int n){
		int sw = 1, k = 0, li = 1, ls = n,x,i;
		while(sw != 0){
			sw = 0;
			if(k == 0){
				for(i=li;i<=ls-1;i++){
					if(a[i]>a[i+1]){
						x = a[i];
						a[i] = a[i+1];
						a[i+1] = x;
						sw = 1;
					}
				}
				ls = ls-1;k=1; 
			}else{
				for(i=ls;i>=li+1;i--){
					if(a[i] < a[i-1]){
						x = a[i];
						a[i] = a[i-1];
						a[i-1]= x;
						sw = 1;
					}
					
				}
				li = li+1; k = 0;
			}
		}
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("n: ");
			int n = sc.nextInt();
			llenarV(n);
			mostrarV(n);
			System.out.println("");
			sacudida(n);
			mostrarV(n);
			System.out.println("");
		}
	}
}
