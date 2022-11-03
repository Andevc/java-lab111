//Busqueda Binaria Enteros
package com.mycompany.lab111.arrays;
import java.util.Scanner;
public class e7 {
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
	static public int busbin(int n,int x){
		int li=1, ls=n, lc=(li+ls)/2, z = -1;
		while(x!=a[lc]){
			if(x>a[lc]){li = lc+1;}
			else{ls = lc-1;}
			lc = (int)(li+ls)/2;
		} 
		if(x==a[lc]){z = lc;}
		return z;
	}
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
			System.out.println("");
			System.out.print("x: ");
			int x = sc.nextInt();
			int x1 = busbin(n,x);
			if(x1>0){
			System.out.println(x+" en la posicion: "+x1);
			}else{
				System.out.println("no existe");
			}
		}
	}

}
