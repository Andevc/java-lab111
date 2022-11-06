package com.mycompany.lab111.funciones;
import java.util.Scanner;
public class ej1 {
    static int sigf(int w){   
        int a,b,d,k,i,s,p;
        a = 1; b = 0;d = 0;k=0;s=1;p=1;
        for(i=1;i<=w;i++)
        {  k=s;
            p=p+1;
            d=a+b;
            if(p>d){
                s = s*(-1);
                p = 1;
                a = b;
                b = d;
            
            }else{}
        }
        return k;
    }   
    
    static int clasica(int w){
        int t,p,k,i;
        t = 1; p = 1;k=0;
          for(i=1;i<=w;i++){
            k=t;
            p=p+1;
            if(p>t){
                t = t+1;
                p=1;
            
            }else{}
       
        }
          return k;
    }

    static int facto(int w){
        int f,i;
        f=1;
        for(i=1;i<=w;i++){  
            f=f*i;
        }   
        return f;
    }
    
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
            if(c>v){
                t=1;s=1;p=1;c=1;
            }else{}
         }
          return r;  
    }
    public static void main(String[] args) {
        int n,x,i,sig,den;
        double expo,s;
        s=0;expo=0;sig=0;den=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("intro n: ");
            n=sc.nextInt();
            System.out.print("intro x: ");
            x=sc.nextInt();
        }
        for(i=1;i<=n;i++){
            sig=sigf(i);
            expo = Math.pow(clasicap(i),facto(subeco(i)));
            den = facto(clasica(i));
            System.out.println(sig+"*"+x+"^"+expo+"/"+den);
            s=s+(sig*(Math.pow(x, expo))/(den));
        }
        System.out.println(s); 
    }
}
