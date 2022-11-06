//Dado un refran, cambiar por una vocal x, todas las vocales

package com.mycompany.lab111.string;
import java.util.Scanner;
public class ej6 {
    static String cambvoc(String w, String k){
        int lon,i;
        String y,v="";
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.compareTo("a") == 0 || y.compareTo("e") == 0 || y.compareTo("i") == 0 || y.compareTo("o")==0|| y.compareTo("u") == 0){
                y = k;
            }
            v = v+y;
        }
            return v;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String b,y,voc;
            System.out.print("b: ");
            b = sc.nextLine();
            System.out.print("vocal: ");
            voc = sc.next();
            y = cambvoc(b, voc);
            System.out.println(y);
        }
    }
}
