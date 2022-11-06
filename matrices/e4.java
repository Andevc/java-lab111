// Llenar una matriz a(n,m), con valores numericos, ordenar las columnas impares DESCENDENTEMENTE, solo columas, en la misma matriz
package com.mycompany.lab111.matrices;
import java.util.Scanner;
public class e4 {
    
    static public int v[][] = new int[20][20];

    static public void llenar(int n, int m){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1; i<=n;i++){
                System.out.println("");
                for(int j=1;j<=m;j++){
                    System.out.print("v["+i+"]["+j+"] = ");
                    v[i][j] = sc.nextInt();
                }
            }
        }
    }
    static public void mostrar(int n, int m){
        System.out.print("v[][] :");
        for(int i=1; i<=n;i++){
            System.out.println("");
            System.out.print("     | ");
            for(int j=1;j<=m;j++){
                System.out.print(v[i][j]+" | ");
            }
        }
    }
    static public void burbuja(int n, int y){
		int i,j,x;
		for(i=1;i<=n;i++){
			for(j=i+1;j<=n;j++){
				if(v[i][y]<v[j][y]){
					x=v[j][y]; 
                    v[j][y] = v[i][y]; 
                    v[i][y] = x;
                    
				}
			}
		}
	}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            int n = sc.nextInt();
            System.out.print("m: ");
            int m = sc.nextInt();
            llenar(n,m);
            System.out.println("");
            mostrar(n, m);
            
            for(int i=1; i<=m; i++){
                if(i%2==1){
                    burbuja(n, i);    
                }
            }
            System.out.println("");
            mostrar(n, m);
            System.out.println("\n");
        }
        
    }
 
}
