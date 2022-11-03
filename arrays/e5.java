// Busqueda Secuencial Enteros
package com.mycompany.lab111.arrays;
import java.util.Scanner;
public class e5 {
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
			System.out.print(a[i]+" | ");
	
		}
		
	}
		
	static public int busec(int n, int x){
		int k=1 , z=-1;
		while(a[k]!= x && k<=n){
			k = k+1;
		}
		if(a[k]==x){ 
			z = k;
		}
		return (z);
	}
	public static void main(String[] args) {
		int n,x,x1;
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("n: ");
			n = sc.nextInt();
			llenarV(n);
			mostrarV(n);
			System.out.println("");
			System.out.print("x: ");
			x = sc.nextInt();
			x1 = busec(n,x);
			System.out.println("x en la posicion: "+x1);
		}
		
	}

}



