//Llenar una matriz a(n,m), encontrar el mayor por filas y vaciar a un vector b(n), solo el mayor por fila 
package com.mycompany.lab111.matrices;
import java.util.Scanner;
public class e2 {
    static public int v[][] = new int[20][20];
    static public int w[] = new int[20];
    
    static public void llenar(int n, int m){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=n;i++){
            System.out.println("");
            for(int j=1;j<=m;j++){
                System.out.print("v["+i+"]["+j+"] = ");
                v[i][j] = sc.nextInt();
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

    static public void mayor(int n, int m){
        for(int i=1;i<=n;i++){
            int may = 0;
            for(int j=1; j<=m; j++){
                if(v[i][j]>may){
                    may = v[i][j];
                    
                }
            }
            w[i] = may;
        }
   
    }

    static public void mostarw(int n){
        System.out.print("w[] = | ");
        for(int i=1;i<=n;i++){
            System.out.print(w[i]+" | ");
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
            System.out.println("\n");
            mayor(n, m);
            mostarw(n);
            System.out.println("\n");
        }
        
    }
}
