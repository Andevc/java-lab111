package com.mycompany.lab111;
import java.util.Scanner;
public class ej7 {

    static int des(int w){
        int y,x=0;
        y = w*10+x;
        return y;
    }

    public static void main(String[] args){
        int n,i,x,co;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            n = sc.nextInt();
            
            for(i=1;i<=n;i++){
                System.out.print("x: ");
                x = sc.nextInt();
                co = des(x);
                System.out.println(co);
            }
        }
        

    }
    
}
