// Array llenar y mostrar un vector con ENTEROS
package com.mycompany.lab111.vec;
import java.util.Scanner;
public class e1 {
    static public int a[] = new int[20];

    static public void llenar(int n){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1;i<=n;i++){
                System.out.print("a["+i+"] = ");
                a[i] = sc.nextInt();
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
