// Dado un vextor, con colores, ordenar en cada palabra las consonantes.

package com.mycompany.lab111.vec;
import java.util.Scanner;
public class e4_d5 {
    static public String v[] = new String[20];
    static public String vv[] = new String[20];

    static public void llenar(int n){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1; i<=n; i++){
                System.out.print("v["+i+"] = ");
                v[i] = sc.next();}}}

    static public void mostrar(int n){
        System.out.println("");
        System.out.print("v[] = | ");
        for(int i=1; i<=n; i++){
            System.out.print(v[i]+" | ");}}
    
    static int esvoc(String w){
        int k = 0;
        if(w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u"))
        {k = 1;}
        return k;}

    static String sacar_consonantes(String w){
        int lon=w.length();
        String y,v1="";
        for(int i=1;i<=lon;i++){
            y = w.substring(i-1, i);
            if( esvoc(y) == 0){v1 = v1+y;}}
        return v1;}

    static public void burbuja(int w){
        int i,j; String x;
        for(i=1; i<=w;i++){
            for(j=1+i;j<=w;j++){
                if(vv[i].compareTo(vv[j]) > 0){
                    x = vv[i];vv[i] = vv[j];vv[j] = x;}}}}

    static public void ordp(String w){
        int lon = w.length(),c=1,i;
        String y;
        for(i=1; i<=lon; i++){
            y = w.substring(i-1, i);
            vv[c] = y;
            c = c+1;}
        burbuja(lon);
    }

    static String ordenar(String w){
        int i,l,pos=1;
        String v1="";
        l = w.length();    
        for(i=1; i<=l; i++){
            String y = w.substring(i-1, i);
            if(esvoc(y) == 0){
                y = vv[pos];
                pos = pos+1;
            }
            v1 = v1+y;
        }
        return v1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n,i;
            String x,v1;
            System.out.print("n: ");
            n = sc.nextInt();
            llenar(n);
            mostrar(n);
            for(i=1; i<=n; i++){
                x = sacar_consonantes(v[i]);
                ordp(x);
                v1 = ordenar(v[i]);
                v[i] = v1;
            }
            mostrar(n);
            System.out.println("\n");  
        }
              
    }
}

