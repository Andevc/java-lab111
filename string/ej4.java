/* Dada una frase, escogar las palabras ares y cambiar a mayusculas, 
mostrar la nueva frase, luego  extraer la siguiente k ésima e invertirla
y mostar la nueva frase, luego extraer la j ésima palabra rotar las vocales a la derecha y mostrar la nueva frase */
package com.mycompany.lab111.string;
import java.util.Scanner;
public class ej4 {
    static int contp(String w){
        int lon,i,c=0;
        String y;
        w = w+" ";
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.compareTo(" ") == 0){
                c =c+1;
            }
        }
        return c;

    }

    static String sacp(String w, int k){
        w = w+ " ";
        int c = 0, lon,i;
        String v = "", z ="",y;
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.compareTo(" ") == 0){
                c = c+1;
                if (c == k){z = v;}
                v = "";
            }else{v = v+y;}
        }
        return z;

    }

    static String rotv(String w){
        int lon,i;
        String  y,v="",v1=" ",v2;
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1,i);
            if(y.compareTo("a") == 0 || y.compareTo("e") == 0 || y.compareTo("i") == 0 || y.compareTo("o")==0|| y.compareTo("u") == 0){
                v2 = v1;
                v1 = y;
            }else{
                v2 = y;
            }
            v = v+v2;
        }
        w = v; v = "";
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.compareTo(" ") == 0){
                y = v1;
            }
            v = v+y;
        }
        return v;
    }

    static String invp(String w){
        String y,v = "";
        int lon,i;
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            v = y+v;
        }
        return v;
    }

    static String convm(String w){
        int lon,i,a1,a2;
        String y,v = "";
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.compareTo(" ") != 0){
                a1 = y.hashCode();
                a2 = a1-32;
                y = ""+(char)a2;
            }
            v = v+y;
        }
        return v;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k,j,i,cp;
            String  b,v,v1,v2,p,p1,p2;
            System.out.print("b: ");
            b = sc.nextLine();
            System.out.print("k: ");
            k = sc.nextInt();
            System.out.print("j: ");
            j = sc.nextInt();
            v ="";v1 = ""; v2 = "";
            cp = contp(b);
            System.out.println(cp);
            for(i=1;i<=cp;i++){
                p = sacp(b,i);
                p1 = sacp(b,i);
                p2 = sacp(b,i);
                if(i%2==0){
                    p = convm(p);
                }
                if(i == k){
                    p1 = invp(sacp(b,k));
                }
                if(i == j){
                    p2 = rotv(sacp(b,j));
                }
                v = v+p+" ";
                v1 = v1+p1+" ";
                v2 = v2+p2+" ";
            }
            System.out.println(v);
            System.out.println(v1);
            System.out.println(v2);
        }
    }    
}
