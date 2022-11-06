//Llenar y mostrar una matriz
package com.mycompany.lab111.matrices;
import java.util.Scanner;
public class e1 {
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
    static public void mostrar_fila(int m, int x){
        System.out.print("v["+x+"][] = |");
        for(int i=1; i<=m; i++){
            System.out.print(v[x][i]+" | ");
        }
        System.out.println("");
    }

    static public void mostrar_columna(int n, int y){
        System.out.print("v[]["+y+"] = |");
        for(int i=1; i<=n; i++){
            System.out.print(v[i][y]+" | ");
        }
        System.out.println("");
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
            //Mostrar una fila de la matriz
            System.out.print("Fila: ");
            int x = sc.nextInt();
            mostrar_fila(m, x);
            //Mostrar una columna de la matriz
            System.out.print("Columna: ");
            int y = sc.nextInt();
            mostrar_columna(n, y);
            System.out.println("\n");
        }
    }
}
