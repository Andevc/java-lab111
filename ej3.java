package com.mycompany.lab111;
import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {
        int k,t,p,s,c,v,i,n;
        k=3;t=1;p=1;s=1;c=1;
        v=k*2-1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            n=sc.nextInt();
        }
        for(i=1;i<=n;i++){
            System.out.print(t+" ");
            t=t+s;
            c++;
            p++;
            if(p == k ){    
            
                s=s*(-1);
                p=1;
            
            }else{}
            if(c>v){
                t=1;
                p=1;
                s=1;
                c=1;
            }else{}
        }
        System.out.println("");
    }
}