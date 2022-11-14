//Tiro al blanco
package com.mycompany.lab111.matrices.generar_matrices;
import java.util.Scanner;
public class e8 {
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
    }
    static public void tiro_al_Blanco(int n){
        int c = 1,i,j,k,ls=n; 
        for(k = 1; k<=n/2; k++){
            i = k;
            for(j = k; j <= ls; j++){ v[i][j] = c;}
            j = ls;
            for(i = k; i <= ls; i++){ v[i][j] = c;}
            i = ls;
            for(j = ls; j >= k; j--){ v[i][j] = c;}
            j = k;
            for(i = ls; i >= k; i--){ v[i][j] = c;}
            c = c+1;
            ls = ls-1;
        }
        if(n%2==1){
            v[n/2+1][n/2+1] = c;
        }

    }
    
    static public void tiro_pares(int n){
        int c = 2,i,j,k,ls=n; 
        for(k = 1; k<=n/2; k++){
            i = k;
            for(j = k; j <= ls; j++){ v[i][j] = c;}
            j = ls;
            for(i = k; i <= ls; i++){ v[i][j] = c;}
            i = ls;
            for(j = ls; j >= k; j--){ v[i][j] = c;}
            j = k;
            for(i = ls; i >= k; i--){ v[i][j] = c;}
            c = c+2;
            ls = ls-1;
        }
        if(n%2==1){
            v[n/2+1][n/2+1] = c;
        }

    }

    static public void tiro_impares(int n){
        int c = 1,i,j,k,ls=n; 
        for(k = 1; k<=n/2; k++){
            i = k;
            for(j = k; j <= ls; j++){ v[i][j] = c;}
            j = ls;
            for(i = k; i <= ls; i++){ v[i][j] = c;}
            i = ls;
            for(j = ls; j >= k; j--){ v[i][j] = c;}
            j = k;
            for(i = ls; i >= k; i--){ v[i][j] = c;}
            c = c+2;
            ls = ls-1;
        }
        if(n%2==1){
            v[n/2+1][n/2+1] = c;
        }

    }
    
    static public void tiro_inv(int n){
        int c ,i,j,k,ls=n;
        if(n%2==0){c = n/2;}
        else{c = n/2+1;} 
        for(k = 1; k<=n/2; k++){
            i = k;
            for(j = k; j <= ls; j++){ v[i][j] = c;}
            j = ls;
            for(i = k; i <= ls; i++){ v[i][j] = c;}
            i = ls;
            for(j = ls; j >= k; j--){ v[i][j] = c;}
            j = k;
            for(i = ls; i >= k; i--){ v[i][j] = c;}
            c = c-1;
            ls = ls-1;
        }
        if(n%2==1){
            v[n/2+1][n/2+1] = c;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("n: ");
            int n = sc.nextInt();
            tiro_al_Blanco(n);
            mostrar(n);
            System.out.println("\n");
            tiro_inv(n);
            mostrar(n);
            System.out.println("\n");
            tiro_pares(n);
            mostrar(n);
            System.out.println("\n");
            tiro_impares(n);
            mostrar(n);
            System.out.println("\n");
        }
    }
}
