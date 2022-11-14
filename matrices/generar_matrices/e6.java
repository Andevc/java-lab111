package com.mycompany.lab111.matrices.generar_matrices;
import java.util.Scanner;
public class e6 {
    static public int v[][] = new int[20][20];

    static public void mostrar(int n){
        System.out.print("v[][] :");
        for(int i=1; i<=n;i++){
            System.out.println("");
            System.out.print("\t|   ");
            for(int j=1;j<=n;j++){
                System.out.print(v[i][j]+"\t|   ");
            }
        }
        System.out.println("\n");
    }

    static public void rombo_1(int n){
        int c = 1, i , j ,ls=n/2+1,li = n/2+1, x = 1;
        for(i=1;i<=n; i++){
            for(j = li; j<=ls; j++) {v[i][j] = c; c = c+1;}
            li = li-x;
            ls = ls+x;
            if(li == 1 && ls == n){
                x = x*(-1);
            }
        }
    }

    static public void rombo_2(int n){
        int c = 1, i , j ,ls=n/2+1,li = n/2+1, x = 1;
        for(i=n;i>=1; i--){
            for(j = li; j<=ls; j++) {v[i][j] = c; c = c+1;}
            li = li-x;
            ls = ls+x;
            if(li == 1 && ls == n){
                x = x*(-1);
            }
        }        
    }


    static public void rombo_3(int n){
        int c = 1, i , j ,ls=n/2+1,li = n/2+1, x = 1;
        for(j=1;j<=n; j++){
            for(i = li; i<=ls; i++) {v[i][j] = c; c = c+1;}
            li = li-x;
            ls = ls+x;
            if(li == 1 && ls == n){
                x = x*(-1);
            }
        }           
    }
    static public void rombo_4(int n){
        int c = 1, i , j ,ls=n/2+1,li = n/2+1, x = 1;
        for(j=n;j>=1; j--){
            for(i = li; i<=ls; i++) {v[i][j] = c; c = c+1;}
            li = li-x;
            ls = ls+x;
            if(li == 1 && ls == n){
                x = x*(-1);
            }
        }           
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n;
            do{
                System.out.println("=== n debe ser impar === ");
                System.out.print("n: ");
                n = sc.nextInt();
            }while( n%2 != 1);
            
            rombo_1(n);
            mostrar(n);
            rombo_2(n);
            mostrar(n);
            rombo_3(n);
            mostrar(n);
            rombo_4(n);
            mostrar(n);
        }
    }



}
