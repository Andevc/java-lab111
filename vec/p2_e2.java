package com.mycompany.lab111.vec;
import java.util.Scanner;
public class p2_e2 {
    static public String a[] = new String[20];
    static public void llenar(int n){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 1; i <= n; i++){
                System.out.print("a["+i+"] = ");
                a[i] = sc.next();}}}
    static public void mostrar(int n){
        System.out.println("");
        System.out.print("a[] = |");
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]+" | ");}}
    static int esvoc(String w){
        int k = 0;
        if(w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u")  ){
            k = 1;}
        return k;}
    static public void eliminar(int n,int p){
        for(int i=p+1; i<=n+1; i++){
            a[i-1] = a[i];}
        a[n] = "";}
    static public void rem(int n){
        for(int i=1; i<=n; i++){
            if(i%2==0){
                if(esvoc(a[i]) == 0){
                    a[i] = "";}}}}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            int n = sc.nextInt();
            llenar(n);
            mostrar(n);
            rem(n);
            System.out.println("");
            for(int i=1;i<=n;i++){                 
                if(a[i].compareTo("") == 0){
                    eliminar(n,i);}}
            mostrar(n);
            System.out.println("");}}}
