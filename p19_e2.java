package com.mycompany.lab111;
import java.util.Scanner;
public class p19_e2 {
    
    static public int v[] = new int[20];
    static public int w[] = new int[20];

    static public void llenar(int n){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1; i<=n; i++){
                System.out.print("v["+i+"] = ");
                v[i] = sc.nextInt();
            }
        }
    }

    static public void mostrar(int n){
        System.out.println("");
        System.out.print("v[] = |");
        for(int i=1; i<=n; i++){
            System.out.print(v[i]+" | ");
        }
    }

    static public void mostrarW(int n){
        System.out.println("");
        System.out.print("w[] = |");
        for(int i=1; i<=n; i++){
            System.out.print(w[i]+" | ");
        }
    }
    
    static public int menor(int n){
        int i,p=0,men=99999;
        for(i=1;i<=n;i++){
            if(v[i] < men){
                men = v[i];
                p = i;
            }
        }
        return p;
    }

    static public void eliminar(int n, int p){
        for(int i=p+1;i<=n+1;i++){
            v[i-1] = v[i];
        }
        v[n] = 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n,i,p;
            System.out.print("n: ");
            n = sc.nextInt();
            int n1 = n;
            llenar(n);
            mostrar(n);
            for(i=1; i<=n1; i++){
                p = menor(n);
                w[i] = v[p];
                eliminar(n, p);
                n = n-1;
            }
            mostrar(n1);
            mostrarW(n1);
            System.out.println();
        }
    }
}
