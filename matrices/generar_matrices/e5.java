// Matriz caracol
package com.mycompany.lab111.matrices.generar_matrices;

import java.util.Scanner;

public class e5 {
    
    static public int v[][] = new int[20][20];

    static public void mostrar(int n){
        System.out.print("v[][] :");
        for(int i=1; i<=n;i++){
            System.out.println("");
            System.out.print("\t| ");
            for(int j=1;j<=n;j++){
                System.out.print(v[i][j]+"\t | ");
            }
        }
        System.out.println("\n");
    }

    static public void caracol_1(int n){
        int c = 1, li = 1, ls = n,i,j;
        for(int k = 1; k<=n/2; k++){
            i = li;
            for(j = li; j<=ls;j++){v[i][j] = c; c = c + 1;}
            j = ls;
            for(i=li+1; i<=ls; i++){v[i][j] = c; c = c + 1;}
            i = ls;
            for(j = ls-1; j>=li; j--){v[i][j] = c; c = c + 1;}
            j = li;
            for(i = ls-1; i >= li + 1 ;i--){v[i][j] = c; c = c + 1;}
            li = li + 1; ls = ls - 1;
        }
        if( n % 2 == 1 ){ v[(int) n / 2 + 1][(int) n / 2 + 1] = c;}
    }

    static public void caracol_2(int n){
        int c = 1,i,j,k,li = 1, ls = n; 
        for(k = 1; k <= n/2; k++){
            i = li;
            for(j = ls; j>=li; j--) {v[i][j] = c; c = c + 1;}
            j = li;
            for(i = li+1; i <= ls; i++ ) {v[i][j] = c; c = c + 1;}
            i = ls;
            for(j = li+1; j <= ls; j++ ) {v[i][j] = c; c = c + 1;}
            j = ls;
            for(i = ls-1; i>= li+1; i--) {v[i][j] = c; c = c + 1;}
            li = li + 1; ls = ls - 1;
        }
        if( n % 2 == 1 ){ v[(int) n / 2 + 1][(int) n / 2 + 1] = c;}
    
    }

    static public void caracol_3(int n){
        int c=1,i,j,k,li=1,ls=n;
        for(k = 1; k<= n/2; k++){
            i = ls;
            for(j = li; j <= ls; j++) { v[i][j] = c; c = c+1;}
            j = ls; 
            for(i = ls-1; i >= li; i--){ v[i][j] = c; c = c+1;}
            i = li;
            for(j = ls-1; j >= li; j--) { v[i][j] = c; c = c+1;}
            j = li;
            for(i = li+1; i <= ls-1; i++) { v[i][j] = c; c = c+1;}
            li = li+1; ls = ls-1;
        }
        if( n % 2 == 1 ){ v[(int) n / 2 + 1][(int) n / 2 + 1] = c;}
    }

    static public void caracol_4(int n){
        int c=1, i,j,k,li=1,ls=n;
        for(k = 1; k <= n/2; k++){
            i = ls; 
            for(j = ls; j >= li; j--) {v[i][j] = c; c = c + 1;}
            j = li;
            for(i = ls-1; i >= li; i--) {v[i][j] = c; c = c + 1;}
            i = li; 
            for(j = li+1; j <= ls; j++) {v[i][j] = c; c = c + 1;}
            j = ls; 
            for(i = li+1; i <= ls-1; i++) {v[i][j] = c; c = c + 1;}
            li = li + 1; ls = ls - 1;
        }
        if( n % 2 == 1 ){ v[(int) n / 2 + 1][(int) n / 2 + 1] = c;}
    }

    static public void caracol_5(int n){
        int c=1, i,j,k,li=1,ls=n;
        for(k = 1; k <= n/2; k++){
            j = li;
            for(i = ls; i>=li; i--) {v[i][j] = c; c = c + 1;}
            i = li;
            for(j = li+1; j<=ls; j++) {v[i][j] = c; c = c + 1;}
            j = ls; 
            for(i = li+1; i<= ls; i++) {v[i][j] = c; c = c + 1;}
            i = ls; 
            for(j = ls-1; j>=li+1; j--) {v[i][j] = c; c = c + 1;}
            li = li + 1; ls = ls - 1;
        }
        if( n % 2 == 1 ){ v[(int) n / 2 + 1][(int) n / 2 + 1] = c;}
    }

    static public void caracol_6(int n){
        int c=1, i,j,k,li=1,ls=n;
        for(k = 1; k <= n/2; k++){
            j = ls; 
            for(i = ls; i>= li; i--){v[i][j] = c; c = c + 1;}
            i = li;
            for(j = ls-1; j>= li; j--){v[i][j] = c; c = c + 1;}
            j = li;
            for(i = li+1; i<= ls; i++) {v[i][j] = c; c = c + 1;}
            i = ls;
            for(j = li+1; j<=ls-1; j++) {v[i][j] = c; c = c + 1;}
            li = li + 1; ls = ls - 1;
        }
        if( n % 2 == 1 ){ v[(int) n / 2 + 1][(int) n / 2 + 1] = c;}
    }

    static public void caracol_7(int n){
        int c=1, i,j,k,li=1,ls=n;
        for(k = 1; k <= n/2; k++){
            j = li; 
            for(i = li; i<=ls; i++){v[i][j] = c; c = c + 1;}
            i = ls;
            for(j = li+1; j <= ls; j++){v[i][j] = c; c = c + 1;}
            j = ls;
            for(i = ls-1; i>= li; i--) {v[i][j] = c; c = c + 1;}
            i = li;
            for(j = ls-1; j>=li+1; j--) {v[i][j] = c; c = c + 1;}
            li = li + 1; ls = ls - 1;
        }
        if( n % 2 == 1 ){ v[(int) n / 2 + 1][(int) n / 2 + 1] = c;}
    }

    static public void caracol_8(int n){
        int c=1, i,j,k,li=1,ls=n;
        for(k = 1; k <= n/2; k++){
            j = ls; 
            for(i = li; i<=ls; i++){v[i][j] = c; c = c + 1;}
            i = ls;
            for(j = ls-1; j >= li; j--){v[i][j] = c; c = c + 1;}
            j = li;
            for(i = ls-1; i >= li; i--) {v[i][j] = c; c = c + 1;}
            i = li;
            for(j = li+1; j<=ls-1; j++) {v[i][j] = c; c = c + 1;}
            li = li + 1; ls = ls - 1;
        }
        if( n % 2 == 1 ){ v[(int) n / 2 + 1][(int) n / 2 + 1] = c;}
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("n: ");
            int n = 5; //sc.nextInt();
            caracol_1(n);
            mostrar(n);
            caracol_2(n);
            mostrar(n);
            caracol_3(n);
            mostrar(n);
            caracol_4(n);
            mostrar(n);
            caracol_5(n);
            mostrar(n);
            caracol_6(n);
            mostrar(n);
            caracol_7(n);
            mostrar(n);
            caracol_8(n);
            mostrar(n);
        }
    }
}
