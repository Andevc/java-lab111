// rotar de k en k
package com.mycompany.lab111.arrays;
import java.util.Scanner;
public class rotk {
    static public int v[] = new int[20];
    static public int vaux[] = new int[20];
    static public void llenar(int n){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1; i<=n; i++){
                System.out.print("a["+i+"] = ");
                v[i] = sc.nextInt();}}}

    static public void mostrar(int n){
        System.out.println("");
        System.out.print("v[] = | ");
        for(int i=1; i<=n; i++){
            System.out.print(v[i]+" | ");
        }
        System.out.println("");}


    static public void guardarK(int n,int k){
        for(int i=n-k; i<=k; i++){
            vaux[i] = v[i];
        }   
    }

    static public void rotar(int n, int k){
        int i,x1=1;
        for(i = n; i<=n ;i--){
            v[i+k] = v[i];
        }

        for(i = 1; i<=k; i++){
            v[i] = vaux[x1];
            x1 = x1+1;
        } 
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {    
            System.out.print("n: ");
            int n = sc.nextInt();
            System.out.print("k: ");
            int k = sc.nextInt();
            llenar(n);
            mostrar(n);
            guardarK(n,k);
            rotar(n, k);
            mostrar(n);
        }   
    }
}
