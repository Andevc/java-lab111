package com.mycompany.lab111.string;
import java.util.Scanner;
public class ej5 {
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

    static String contvoc(String w){
        String y,vocmay="";
        int i,lon,vm=1,c=0,c1=0,c2=0,c3=0,c4=0;
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if(y.compareTo("a") == 0){
                c = c+1;
            }else{
                if (y.compareTo("e") == 0) {
                    c1 = c1+1;
                } else {
                    if (y.compareTo("i") == 0) {
                        c2 = c2+1;
                    } else {
                        if (y.compareTo("o") == 0) {
                            c3 = c3+1;
                        } else {
                            if (y.compareTo("u") == 0) {
                                c4 = c4+1;
                            }
                        }
                    }
                }
            }
        }
        if(c>vm){vm=c;vocmay="a";}
        else{
            if (c1>vm) {
                vm = c1;
                vocmay = "e";
            } else {
                if (c2>vm) {
                    vm = c2; vocmay = "i";
                } else {
                    if (c3>vm) {
                        vm = c3; vocmay = "o";
                    } else {
                        if(c4>vm){vm = c4; vocmay = "u";}
                    }
                }
            }
        }
        
        return vocmay;
    }
    
    static String delvoc(String w){
        int lon,i;
        String v = "", y;
        lon = w.length();
        for(i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            System.out.println(y);
            if(y.compareTo(contvoc(w)) == 0){
                y = "";
            }
            v = v+y;
        }
        return v;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cp,i;
            String b,p,v="";
            System.out.print("b: ");
            b = sc.nextLine();
            cp = contp(b);
            for(i=1;i<=cp;i++){
                p = sacp(b,i);
                if(i%2==1){
                    p = delvoc(p);
                }
                v = v+p+" ";
            }
            System.out.println(v);
        }   
    }
}

