package com.mycompany.lab111.torres_de_hanoi; //PARA EJECUTARLO SE DEBE CAMBIAR LA DIRECCION DE PACKAGE
import java.util.*;
public class Hanoi {
    static public int disco(int i) { // DEVUELVE EL DISCO PARA SER MOVIDO EN i
        int j, x = i + 1; // YA QUE FOR EMPIEZA CON 0, SUMA 1
        for (j = 0; x % 2 == 0; j++) { // DIVISIÓN CONTINUA POR 2 HASTA QUE OCURRE IMPAR
            x = x / 2;
        }
        
        return j; // RETORNA EL CONTADOR C
    }
    static public int movimientos(int i, int d) { // CUÁNTAS VECES SE HA MOVIDO EL DISCO d ANTES DE LA ETAPA I
        while (d-- != 0)
            i = i / 2;
        
        return (i + 1) / 2;
    }
    static public int direccion(int d, int n) { // CADA DISCO SE MUEVE EN LA MISMA DIRECCIÓN CW=1, ACW=2
        int x = 2 - (n + d) % 2;
        
        return x;
    }
    
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("");
            System.out.print("Introduce el numero de discos : ");
            int n = sc.nextInt();
            int limit = (int) Math.pow(2, n) - 1; // NUMERO DE ITERACIONES = 2^n – 1
            for (int i = 0; i < limit; i++) {
                int disco = disco(i); // MOVER EL DISCO
                int origen = (movimientos(i, disco) * direccion(disco, n)) % 3; // TORRE DE ORIGEN
                int destino = (origen + direccion(disco, n)) % 3; // TORRE DE DESTINO
                System.out.println("mover el disco |"+(disco + 1)+"| de la Torre |" + (origen + 1) + "| a la Torre |" + (destino + 1)+"|");}
            
            System.out.println("");
            }
                
        }
    }
  


