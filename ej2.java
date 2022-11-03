package com.mycompany.lab111;
import java.util.Scanner;
public class ej2 {
    static int clasicap(int w){
        int t,p,k,i;
        t=2;p=1;k=t;
        for(i=1;i<=w;i++){
            k=t;
            p=p+1;
            if(p>t){
                t=t+2;
                p=1;           
            }else{}
        }
        return k;
    }
    static int subeco(int w){
        int k,r,t,p,s,c,v,i;
        k=3;t=1;p=1;s=1;c=1;v=k*2-1;r=0;
        for(i=1;i<=w;i++){
            r=t;
            t=t+s;
            p=p+1;
            c=c+1;
            if(p==k){
                s=s*(-1);
                p=1;
            }else{}
            if(c>v)
                {t=1;s=1;p=1;c=1;}
            else{}
        }
        return r;    
    }
    static int facto(int w){

        int f,i;
        f=1;
        for(i=1;i<=w;i++){  
            f=f*i;
        }   
        return f;
    }

    
    public static void main(String[] args) {
        int n,i,c2,c3,c4,c;
        double expo,expo2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("intro n: ");
            n=sc.nextInt();
        }
        for(i=1;i<=n;i++){
            c2=clasicap(i);
            c3=subeco(i);
            c4=facto(i);
            c=facto(subeco(i));
            expo=Math.pow(clasicap(i), facto(subeco(i)));
            expo2=Math.pow(c2, c);
            System.out.println(c2+" | "+c3+" | "+c4);
            System.out.println(expo);
            System.out.println(expo2);
            System.out.println("========================");


        }
        System.out.println("");
    }
}