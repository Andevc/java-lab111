// dada una frase eliminar la segunda vocal de las palabras pares 
//  ejm b = "hola estamos comiendo mucho" 
//  ouput = "hola estmos comiendo much"
package com.mycompany.lab111.defLab111;
import java.util.Scanner;
public class d4_e4 {
    static int contar_palabra(String w){
        String y;
        w = w + " ";
        int c = 0,i,lon;
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.equals(" ")){
                c = c+1;
            }
        }
        return c;
    }
    static String sacar_palabras(String w, int k){
        w = w + " "; 
        int lon,i,c=0;
        String y,v="",z="";
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.equals(" ")){
                c = c+1;
                if(c == k){
                    z = v;
                }
                v = "";
            }else{
                v = v+y;
            }
        }
        return z;
    }

    static int es_vocal(String w){
        int k = 0;
        if(w == "a" || w == "e" || w == "i" || w == "o" || w == "u"){
            k = 1;
        }
        return k;
    }

    static String borrar_vocal(String w){
        int lon,i,c = 0;
        String y,v="";
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1,i);
            if(es_vocal(y) == 1){
                c = c+1;
                if(c == 2){
                    y = "";
                }
            }
            v = v+y;
        }
        return v;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String b,v="",p;
            int cp,i;
            System.out.print("b: ");
            b = sc.nextLine();
            cp = contar_palabra(b);
            for(i=1;i<=cp;i++){
                p = sacar_palabras(b, i);
                if(i%2==0){
                    p = borrar_vocal(p);
                }
                v = v+p+" ";
            }
            System.out.println(v);
        }
    }
}
