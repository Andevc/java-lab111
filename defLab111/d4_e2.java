package com.mycompany.lab111.defLab111;
import java.util.Scanner;
public class d4_e2 {
    static int invertir_numero(int w, int p){
        if(w<10){
            return w;
        }else{
            return ((w%10)*(int)Math.pow(10,p)) + invertir_numero((int)w/10, p-1);
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n,d,cd;
            System.out.print("n: ");
            n = sc.nextInt();
            cd = (int)Math.log10(n);
            d = invertir_numero(n, cd);
            System.out.println(d);
        }
    } 
}
