package com.mycompany.lab111;
import java.util.Scanner;
public class ej8 {
    public static Scanner lee=new Scanner(System.in);
    public static void main(String[] args) {
    System.out.print("n: ");
    int n=lee.nextInt();
    System.out.print("t: ");
    int t=lee.nextInt();
    System.out.print("v: ");
    int v[]=new int[n+1];
    
    llenar(v,n);
    for (int i = 1; i <=t; i++) {
    rotar(v,n);
    }
    mostrar(v,n);
    }
    private static void rotar(int[] v, int n){ 
    int temp = v[n]; 
    for(int i=n; i>=1; i--){
    v[i] = v[i-1];
    }
    v[1] = temp;
    }
    private static void llenar(int[] v, int n) {
    for (int i =1; i <=n; i++) {
    v[i]=lee.nextInt();
    }
    }
    private static void mostrar(int[] v, int n) {
    for (int i=1; i <=n; i++) {
    System.out.print(v[i]+" , ");
    } 
    System.out.println();
    }
    
}    

