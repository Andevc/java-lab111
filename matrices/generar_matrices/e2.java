//Matrices en ele
package com.mycompany.lab111.matrices.generar_matrices;
import java.util.Scanner;
public class e2 {
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

    static public void ele1(int n){
        int c = 1,j=1,i,k;
        for(k=1; k<=n; k++){
            j = k;
            for(i=1; i<=k; i++){v[i][j] = c;c = c+1;}
            i = k;
            for(j = k-1; j>= 1; j--){v[i][j] = c;c = c+1;}
        }
    }
    static public void ele2(int n){
        int c = 1,j,i,k,li = 1;
        for(k=n; k>=1; k--){
            j = k;
            for(i = 1 ; i<=li; i++){v[i][j] = c;c = c+1;}
            i = li;
            for(j = k+1; j<= n; j++){v[i][j] = c;c = c+1;}
            li = li+1;
        }
    }
    
    static public void ele3(int n){
        int c = 1,j,i,k,ls=n;
        for(k=1; k<=n; k++){
            j = k;
            for(i = n; i >= ls; i--){v[i][j] = c ; c = c+1;}
            i = ls;
            for(j = k-1; j >= 1; j--){v[i][j] = c ;c = c+1;}
            ls = ls-1;
        }
    }

    static public void ele4(int n){
        int c = 1,j=1,i,k,ls=n;
        for(k = n; k >= 1; k--){
            j = k;
            for(i = n; i >= ls; i--){v[i][j] = c ; c = c+1;}
            i = ls;
            for(j = k+1; j <= n ; j++){v[i][j] = c ; c = c+1;}
            ls = ls-1;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int op,n;
            System.out.print("n: ");
            n = sc.nextInt();     
            do{
                System.out.println("1. Ele1");
                System.out.println("2. Ele2");
                System.out.println("3. Ele3");
                System.out.println("4. Ele4");
                System.out.println("5 .Salir");
                System.out.print("ele: ");
                op = sc.nextInt();
                switch(op){

                    case 1:     
                            ele1(n);
                            mostrar(n);
                            break;
                    case 2:     
                            ele2(n);
                            mostrar(n);
                            break;
                    case 3:     
                            ele3(n);
                            mostrar(n);
                            break;
                    case 4:     
                            ele4(n);
                            mostrar(n);
                            break;
                }
            }while(op != 5);
        }
    }
}
