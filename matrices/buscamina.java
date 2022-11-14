package com.mycompany.lab111.matrices;

import java.util.Scanner;

public class buscamina {

    static public int v[][] = new int[11][11];
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
// Llenar minas aleatoriamente
    static public void tnt(int n){
        int c = 0;
        while(c < n){    
            double x = Math.random()*n;
            double y = Math.random()*n;
            if  (x!=0 && y!=0 && x!=n-1 && y!=n-1){
                v[(int)x][(int)y] = 99;
                c = c+1;
            }
        }
    }
// Conteo de minas al rededor de la coordenada

    static public int conteo_tnt(int x, int y){
        int c = 0;
        if(v[x-1][y-1] == 99){c= c+1;}
        if(v[x-1][y] == 99){c= c+1;}
        if(v[x-1][y+1] == 99){c= c+1;}
        if(v[x][y-1] == 99){c= c+1;}
        if(v[x][y+1] == 99){c= c+1;}
        if(v[x+1][y-1] == 99){c= c+1;}
        if(v[x+1][y] == 99){c= c+1;}
        if(v[x+1][y+1] == 99){c= c+1;}
        return c;
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n,x,y,c=0,z=0;

            n = 10;
            tnt(n);
            mostrar(n);

            do{    
                System.out.print("Fila: ");
                x = sc.nextInt();
                System.out.println("");
                System.out.print("Columna: ");
                y = sc.nextInt();
                if(v[x][y] == 99){
                    z = 1;
                    System.out.println("F?");
                }else{
                    c = conteo_tnt(x, y);
                    System.out.println("Alrededor de x,y hay "+c+" minas");
                }
            }while(z != 1);

            

            


            System.out.println("\n\n");
        }
    }

}
