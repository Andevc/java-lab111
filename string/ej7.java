// rotar las vocales a la derecha de las posiciones impares y mostrar la palabra que tiene las 5 vocales
package com.mycompany.lab111.string;
import java.util.Scanner;
public class ej7 {
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

    static int contvoc(String w){
        String y;
        int i,lon,c=0,c1=0,c2=0,c3=0,c4=0,k=0;
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.compareTo("a") == 0){
                c = 1;
            }else{
                if (y.compareTo("e") == 0) {
                    c1 = 1;
                } else {
                    if (y.compareTo("i") == 0) {
                        c2 = 1;
                    } else {
                        if (y.compareTo("o") == 0) {
                            c3 = 1;
                        } else {
                            if (y.compareTo("u") == 0) {
                                c4 = 1;
                            }
                        }
                    }
                }
            }
        }
        if(c>0 && c1>0 && c2>0 && c3>0 && c4>0){
            k = 1;
        }
        return k;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String b,v="",vls="",p;
            int cp,i,cv;
            System.out.print("b: ");
            b = sc.nextLine();
            cp = contp(b);
            for(i=1;i<=cp;i++){
                p = sacp(b, i);
                cv = contvoc(p);
                if(cv == 1){vls = vls + p+ " ";}
                if(i%2==1){p = rotv(sacp(b, i));}
                v = v+p+" ";
            }
            System.out.println(v);
            System.out.println(vls);
        }
    }
}
