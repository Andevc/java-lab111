//Burbuja Invertido

package com.mycompany.lab111.matrices;
import java.util.Scanner;
public class inv {
    static public int v[] = new int[20];
    static public void llenarV(int w){
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=1;i<=w;i++){
				System.out.print("v["+i+"]= ");
				v[i] = sc.nextInt();}
		}
    }
	
	static public void mostrarV(int w){
		System.out.println("");
		for(int i=1; i<=w; i++){ 
			System.out.print(v[i]+" | ");
        }
    }
    static public void burbuja(int w){
		int i,j,x;
		for(i=1;i<=w;i++){
			for(j=i+1;j<=w;j++){
				if(v[i]>v[j]){
					x=v[i]; v[i] = v[j]; v[j] = x;
				}
			}
		}
	}   
    static public void burbujainv(int w){
		int i,j,x,y = w;
		for(i=1;i<=w;i++){
			for(j=i+1;j<=w;j++){
				if(v[i]<v[j]){
					x=v[j];
                    v[j] = v[i]; 
                    v[i] = x;
                    y = y - 1;
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
            System.out.println("Bubuja Invertido");
            burbujainv(n);
			mostrarV(n);
            System.out.println("");
		}
		
	}        



}
