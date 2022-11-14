// Matriz en X
package com.mycompany.lab111.matrices.generar_matrices;
import java.util.Scanner;
public class e4 {
    static public int v[][] = new int[20][20];

    static public void mostrar(int n){
        System.out.print("v[][] :");
        for(int i=1; i<=n;i++){
            System.out.println("");
            System.out.print("\t|   ");
            for(int j=1;j<=n;j++){
                System.out.print(v[i][j]+"\t|   " );
            }
        }
        System.out.println("\n");
    }

    static public void matrizx1(int n){  //izq -> der <-  
        int c = 1,i,j;
        for(i = 1; i <= n; i++){v[i][i] = c; c = c + 1;}
        int x = 1;
        for(j = n; j >= 1; j--){
            if(v[x][j] == 0){ v[x][j] = c ; c = c + 1;}
            x = x + 1;
        }        
    }

    static public void matriz_x2(int n){
        int c = 1, i,j;
        for(i = n; i >= 1; i--){ v[i][i] = c; c = c + 1;}
        i = n;
        for(j = 1; j <= n; j++){
            if(v[i][j] == 0){ v[i][j] = c ; c = c + 1;}
            i = i - 1;
        }
    }


    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){
            int op;
            System.out.print("n: ");
            int n = sc.nextInt();
            do{
                System.out.println("1. Matriz X 1");
                System.out.println("2. Matriz X 2");
                System.out.println("3. Matriz X 3");
                System.out.println("4. Matriz X 4");
                System.out.println("5. Salir");
                op = sc.nextInt();
                switch(op){
                    case 1:
                            matrizx1(n);
                            mostrar(n);
                            break;
                    case 2: 
                            matriz_x2(n);
                            mostrar(n);
                            break;

                }
            }while(op != 5);
            System.out.println("\n");
        }
    }


}
