//Busqueda Binaria Cadenas
package com.mycompany.lab111.arrays;
import java.util.Scanner;
public class e8 {
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
	//busqueda binaria Cadenas
		static public int busbin(int n,String x){
			int li=1, ls=n, lc=(li+ls)/2, z = -1;
			while(x.compareTo(a[lc]) != 0){
				if(x.compareTo(a[lc])>0){li = lc+1;}
				else{ls = lc-1;}
				lc = (int)(li+ls)/2;
			}
			if(x.equals(a[lc])){z = lc;}
			return z;
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
			String x = sc.next();
			int x1 = busbin(n,x);
			if(x1>0){
			System.out.println(x+" en la posicion: "+x1);
			}else{ 
				System.out.println("no existe");
			}
		}
	}

}

