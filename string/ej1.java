// hola <-> HOLA
package com.mycompany.lab111.string;
import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        int lon,i,a1,a2;
        String b,y,v="";
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Intro cad: ");
            b = sc.nextLine();
        }
        lon = b.length();
        for(i=1;i<=lon;i++){
            y = b.substring(i-1, i);
            if(y.compareTo(" ") != 0){
                a1 = y.hashCode();
                a2 = a1-32;
                y = ""+(char)a2;
            }
            v = v+y;
        }
        System.out.println("cad = "+v);
    }    
}