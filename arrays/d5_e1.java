package com.mycompany.lab111.arrays;

import java.util.Scanner;

public class d5_e1 {

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
        for(int i = 1;i<=n;i++){
            System.out.print(a[i]+" | ");
        }
    }
    
    public static void main(String[] args) {
        
    }

}
