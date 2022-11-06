// mostrar el n fibo recursivamente
package com.mycompany.lab111.funciones;
import java.util.Scanner;
public class ej6 {
    
    static public int fibo(int n){
        if(n == 0){
            return n;
        }else{
            return (fibo(n-1)+fibo(n-2));
        }
    }

    
    public static void main(String[] args){
        int f,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            n = sc.nextInt();
            f = fibo(n);
            System.out.println(f);
        }
    }
}
