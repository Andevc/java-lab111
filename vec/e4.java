// BURBUJA CADENAS
package com.mycompany.lab111.vec;
import java.util.Scanner;
public class e4 {
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
    static public void burbuja(int n){
        int i,j;
        String x;
        for(i=1;i<=n;i++){
            for(j=i+1;j<=n;j++){
                if(a[i].compareTo(a[j]) > 0 ){
                    x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            int n = sc.nextInt();
            llenar(n);
            mostrar(n);
            burbuja(n);
            mostrar(n);
            System.out.println("\n");
        }
    }
}
