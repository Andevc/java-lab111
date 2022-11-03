// Array llenar y mostrar un vector con CADENAS
package com.mycompany.lab111.vec;
import java.util.Scanner;
public class e2 {
    static public String a[] = new String[20];

    static public void llenar(int n){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1;i<=n;i++){
                System.out.print("a["+i+"] = ");
                a[i] = sc.next();
            }
        }
    }

    static public void mostrar(int n){
        System.out.println("");
        for(int i=1;i<=n;i++){
            System.out.print(a[i]+" | ");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            int n = sc.nextInt();
            llenar(n);
            mostrar(n);
            System.out.println("");
        }
    }

}
