/* package com.mycompany.lab111.expo;
import java.util.*;
public class hanoi {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Numero de discos: ");
            n = sc.nextInt();
            Hanoi(n,1,2,3);
        }
    }

    public static void Hanoi(int n, int origen, int aux, int destino){
        if(n==1){
            System.out.println("disco |"+origen+"| a |"+destino+"|");
        }else{
            Hanoi(n-1,origen,destino,aux);
            System.out.println("disco |"+origen+"| a |"+destino+"|");
            Hanoi(n-1,aux,origen,destino);
        }
    }
} */

package com.mycompany.lab111.expo;
import java.util.*;
public class hanoi_recursivo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("");
            int n;
            System.out.print("Numero de discos: ");
            n = sc.nextInt();
            Hanoi(n,1,2,3);
            System.out.println("");
        }
    }

    public static void Hanoi(int n, int origen, int aux, int destino){
        if(n==1){
            System.out.println("disco "+n+" de la torre |"+origen+"| a la torre |"+destino+"|");
        }else{
            Hanoi(n-1,origen,destino,aux);
            System.out.println("disco "+n+" de la torre |"+origen+"| a la torre |"+destino+"|");
            Hanoi(n-1,aux,origen,destino);
        }
    }
}
