// Ordenar un numero con los digitos impares descendentes

package com.mycompany.lab111.defLab111;
import java.util.Scanner;
public class d4_e1 {
    static int sacar_impares(int w){
        int y,d,cd;
        y = 0;
        cd = (int)Math.log10(w) + 1;
        while(cd != 0){
            d = w % 10;
            w = w / 10;
            cd = cd-1;
            if(d % 2 == 1){
                y = y*10+d;
            }
        }
        return y;
    }

    static int descendente(int w){
        int y = 0, y1 = 0,y2=0, y3=0,y4=0,d,vf=0,cy,cy1,cy2,cy3;
        while( w != 0){
            d = w%10;
            w = w/10;
            if(d == 1){y = y*10+d;}
            if (d == 3) {y1 = y1*10+d;}
            if (d == 5) {y2 = y2*10+d;} 
            if (d == 7) {y3 = y3*10+d;}
            if (d == 9) {y4 = y4*10+d;}   
                        
            }
        cy = (int)Math.log10(y) +1;
        cy1 = (int)Math.log10(y1) +1;
        cy2 = (int)Math.log10(y2) +1;
        cy3 = (int)Math.log10(y3) +1;

        vf = y4*(int)(Math.pow(10,cy3)) + y3;
        vf = vf*(int)(Math.pow(10,cy2)) + y2;
        vf = vf*(int)(Math.pow(10,cy1)) + y1;
        vf = vf*(int)(Math.pow(10,cy)) + y;
        
        return vf;
    }
        
    
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n,y,p,cd,d,m,d1,x;
        System.out.print("n: ");
        n = sc.nextInt();
        cd = (int)Math.log10(n) + 1;
        y = 0; p = 1;
        x = sacar_impares(n);
        m = descendente(x);
        while(cd != 0){
            d = n%10;
            n = n/10;
            
            cd = cd-1;
            if( d % 2 == 1){
                d1 = m%10;
                m = m/10;
                d = d1;
            }
            y = d*p+y;
            p = p*10;
        }
        System.out.println(y);
    }
    }

}
