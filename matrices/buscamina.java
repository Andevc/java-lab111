//@Cristhian Escobar - Andev
package com.mycompany.lab111.matrices;
import java.util.Scanner;
public class buscamina {

    static public int v[][] = new int[11][11];
    static public int w[][] = new int[11][11];
// Mostrar matriz con las minas    
    static public void mostrar(int n){
        for(int i=1; i<=n;i++){
            System.out.println("");
            System.out.print("\t|   ");
            for(int j=1;j<=n;j++){
                System.out.print(v[i][j]+"\t|   ");
            }
        }
        System.out.println("\n");
    }
// Mostrar la matriz con las minas escondidas
    static public void mostrarw(int n){
        for(int i=1; i<=n;i++){
            System.out.println("");
            System.out.print("\t|   ");
            for(int j=1;j<=n;j++){
                System.out.print(w[i][j]+"\t|   ");
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
            int n,x,y,c=0,z=0,i=50;
            n = 10; // Tamaño de la matriz del juego 
            tnt(n);            
            System.out.println("\n-x--------------------------------------------------x-");
            System.out.println("\t\tBUSCA MINAS");
            System.out.println("-x--------------------------------------------------x-");
            System.out.println("\nIngresa las coordenadas en rango del 1 al 10\n");
            System.out.println("\nTienes "+i+" intentos");

            while(z != 1){
                System.out.println("\n-x--------------------------------------------------x-");
                System.out.print("\tFila: ");
                x = sc.nextInt();
                System.out.println("");
                System.out.print("\tColumna: ");
                y = sc.nextInt();
                if(v[x][y] == 99){
                    z = 1;
                    System.out.println("\n-x--------------------------------------------------x-");
                    System.out.println("-x-------- TODAS LAS MINAS EXPLOTARON --------x-");
                    System.out.println("\n-x--------------------------------------------------x-");
                    mostrar(n);
                    System.out.println("\n-x--------- GAME OVER ----------x-\n");
                }else{
                    c = conteo_tnt(x, y);
                    w[x][y] = 11;
                    System.out.println("Hay "+c+" minas al rededor");
                    mostrarw(n);
                    i = i - 1;
                    System.out.println("\nIntentos Restantes: "+i);
                }
                if(i == 0){
                    System.out.println("\n-x--------- GANASTE!!! ----------x-\n");   
                    z = 1;
                }   
                if(x==0 || y==0 || x>n || y>n)
            		 	System.out.println("\n-x----- Coordenadas Fuera de Rango -----x-\n");
            }
            System.out.println("\n\n");
        }
    }

}
