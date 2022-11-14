package com.mycompany.lab111.matrices.generar_matrices;
import java.util.Scanner;
public class e7 {
    static public int v[  ]  []     = new int[20][20];


    static public void mostrar(int n){
        System.out.print("v[][]:");
        for(int i=1; i<=n;i++){
            System.out.println("");
            System.out.print("\t|   ");
            for(int j=1;j<=n;j++){
                System.out.print(v[i][j]+"\t|   ");

            }
        }
        System.out.println("\n");
    }
/*     static public void vibora(int n){
        v[  1  ][  1  ] = 1;

        v[  1  ][  2  ] = 2;

        v[  2  ][  1  ] = 3;

        v[  3  ][  1  ] = 4;

        v[  2  ][  2  ] = 5;

        v[  1  ][  3  ] = 6;

        v[  1  ][  4  ] = 7;

        v[  2  ][  3  ] = 8;

        v[  3  ][  2  ] = 9;

        v[  4  ][  1  ] = 10;

        v[  5  ][  1  ] = 11;

        v[  4  ][  2  ] = 12;

        v[  3  ][  3  ] = 13;

        v[  2  ][  4  ] = 14;

        v[  1  ][  5  ] = 15;

        v[  2  ][  5  ] = 16;

        v[  3  ][  4  ] = 17;

        v[  4  ][  3  ] = 18;

        v[  5  ][  2  ] = 19;

        v[  5  ][  3  ] = 20;

        v[  4  ][  4  ] = 21;

        v[  3  ][  5  ] = 22;

        v[  4  ][  5  ] = 23;

        v[  5  ][  4  ] = 24;

        v[  5  ][  5  ] = 25;
    } */

    static public void vibora(int n){
        int c = 1, i,j,k,li=1,ls=1;
        for(k = 1; k <= n; k++){
            j = k;
            for(i = li; i<=ls; i++){v[i][j] = c; c = c+1;}
            i = li;
            for(j = ls+1; j>=li+1; j--){v[i][j] = c; c = c+1;}
            j = li;

            li = li+1;ls = ls+1;
            
        }

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("n: ");
            int n = 5; //sc.nextInt();
            vibora(n);
            mostrar(n);


        }
    }
}
