// Busqueda Secuencial Cadenas
package com.mycompany.lab111.arrays;
import java.util.Scanner;
public class e6 {
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

    static public int busec(int n, String x){
        int k=1 , z=-1;
        while(a[k].compareTo(x) != 0 && k<=n){
            k = k+1;
        }
        if(a[k].equals(x)){
            z = k; 
        }
        return (z);
    }
    public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String x;
			System.out.print("n: ");
			int n = sc.nextInt();
			llenarV(n);
			mostrarV(n);
			System.out.println("");
			System.out.print("x: ");
			x = sc.nextLine();
			int x1 = busec(n,x);
			System.out.println(x+" en la posicion: "+x1);
		}
	
		
	}
}
