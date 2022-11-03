// Busqueda Secuencial Enteros

package com.mycompany.lab111.vec;
import java.util.Scanner;
public class e5 {
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
        
        for(int i=1;i<=n;i++){
            System.out.print(a[i]+" | ");
        }
        System.out.println("");
    }
    static public int bussec(int n, int x){
        int k = 1, z = -1;
        while(a[k] != x && k<=n){
            k = k+1;
        }
        if(a[k] == x){z = k;}
        return z;
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n,x,y;
            System.out.print("n: ");
            n = sc.nextInt();
            
            llenar(n);
            mostrar(n);
            /* System.out.println("");
            System.out.print("x: "); */
            x = sc.nextInt();
            y = bussec(n, x);
            System.out.println(x+" esta en la posicion: "+y);
            System.out.println("");
        }
            
        
    }  
}
