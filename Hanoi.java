/* package com.mycompany.lab111;
import java.util.*;
public class Hanoi {
    private int nDisks; // INSTANCE VARIABLE
    public Hanoi(int nDisks) { // CONSTRUCTOR
        this.nDisks = nDisks;
    }
    public void execute() {
        int n = nDisks; // NUMBER OF DISKS
        int limit = (int) Math.pow(2, n) - 1; // NUMBER OF ITERATIONS = 2^n – 1
        for (int i = 0; i < limit; i++) {
            int disk = disk(i); // DISK TO BE MOVED
            int source = (movements(i, disk) * direction(disk, n)) % 3; // SOURCE PEG
            int destination = (source + direction(disk, n)) % 3; // DESTINATION PEG
            move(disk, source, destination);
        }
    }

    private int disk(int i) { // RETURNS THE DISK TO BE MOVED IN i
        int C, x = i + 1; // SINCE FOR STARTS WITH 0, ADDING 1
        for (C = 0; x % 2 == 0; C++) { // CONTINUOUS DIVISION BY 2 UNTIL ODD OCCURS
            x /= 2;
        }
        return C; // RETURNS THE COUNTER C
    }

private int movements(int i, int d) { // HOW MANY TIMES DISK d HAS MOVED BEFORE STAGE i
while(d--!=0)
i/=2;
return (i+1)/2;
}

private int direction(int d,int n) { // EACH DISK MOVES IN SAME DIRECTION CW=1, ACW=2
return 2 - (n + d)%2;
}

private void move(int disk, int source, int destination) {
System.out.println("Move Disk " + (disk+1)+ " from Tower " + (source+1) + " to Tower " + (destination+1));
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the No. of Disks : ");
Hanoi toh=new Hanoi(sc.nextInt());
toh.execute();
}
}
 */

package com.mycompany.lab111; //PARA EJECUTARLO SE DEBE CAMBIAR LA DIRECCION DE PACKAGE
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
            System.out.print("Introduce el numero de discos : ");
            int n = sc.nextInt();
            int limit = (int) Math.pow(2, n) - 1; // NUMERO DE ITERACIONES = 2^n – 1
            for (int i = 0; i < limit; i++) {
                int disco = disco(i); // MOVER EL DISCO
                int origen = (movimientos(i, disco) * direccion(disco, n)) % 3; // TORRE DE ORIGEN
                int destino = (origen + direccion(disco, n)) % 3; // TORRE DE DESTINO
                System.out.println("mover el disco |"+(disco + 1)+"| de la Torre |" + (origen + 1) + "| a la Torre |" + (destino + 1)+"|");}
              
            }
        }
    }



