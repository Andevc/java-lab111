//Llenar una matriz
package com.mycompany.lab111.matrices;
import java.util.Scanner;
public class e1 {
    static public int v[][] = new int[20][20];
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
    static public void mostrarfila(int m, int x){
        System.out.print("v["+x+"][] = |");
        for(int i=1; i<=m; i++){
            System.out.print(v[x][i]+" | ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("m: ");
        int m = sc.nextInt();
        llenar(n,m);
        System.out.println("");
        mostrar(n, m);
        System.out.println("\n");
        //Mostrar una fila de la matriz
        System.out.print("fila: ");
        int x = sc.nextInt();
        mostrarfila(m, x);
        System.out.println("\n");
    }
}
