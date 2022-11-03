package com.mycompany.lab111;
// @autor cris
import java.util.Scanner;
public class ej4 {
    static int mayor2(int w){
        int m,m2,d;
        m = 0; m2 = 0;
        while(w != 0){
            d=w%10;
            w=w/10;
            if(d>m){
                m2 = m;
                m = d;
            }else{
                if(d>m2){
                    m2 = d;
                }else{}
            }
        }
        return m2;
    }
    
    static int cambio(int w,int aux,int dm){
        int y,p,d;
        y=0;p=1;
        while(w != 0){
            d = w % 10;
            w = w / 10;
            if(d == dm){
                d = aux;
           }
            y = d*p+y;
            p = p*10;
        }
        return y;
    }
    public static void main(String[] args){
        int n,x,i,r,dm,k,z,x1,aux;
        r = 0;dm = 0;k=0;z=1;x1=0;aux=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            n = sc.nextInt();
            for(i=1;i<=n;i++){
                System.out.print("x: ");
                x = sc.nextInt();
                aux = dm;
                dm = mayor2(x);
                r = cambio(x,aux,dm);
                if(k!=0){
                    System.out.println(r);
                }else{
                    k=1;
                }
                if(z!=0){
                    x1=x;
                    z=0;
                }
            }
        }
        x = x1;
        aux=dm;
        dm=mayor2(x);
        r=cambio(x,aux,dm);
        System.out.println(r);

    }    
}