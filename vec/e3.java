// BURBUJA ENTEROS

package com.mycompany.lab111.vec;
import java.util.Scanner;
public class e3 {
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

    static public void burbuja(int n){
        int i,j,x;
        for(i=1;i<=n;i++){
            for(j=i+1;j<=n;j++){
                if(a[i] > a[j]){
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
            System.out.println("");
        }
    }


}
