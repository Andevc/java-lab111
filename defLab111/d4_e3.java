// dado un lote de n numeros, formar un nuevo numero con los digitos cuyo salto vaya segun la fibonacci al rededor del lote 
// n = 4  x = 1234 , 564231, 1452, 3245231 -->  ouput = 1 , 2, 34, 564, 23114, 52324523
// deveulve el digito formado y elresiduo , se usa cd = math.log10(d) == c  //c = a+b
// hacemos una composicion o sea primero descomponemos y despues componemos
package com.mycompany.lab111.defLab111;
import java.util.Scanner;
public class d4_e3 {
    static public int s1,s2,s3;
    static void salto(int w, int a, int b){
        int y,c,d,cd,df,cdy;
        y = 0; c = 0;
        cd = (int) Math.log10(w) + 1;
        while(cd != 0){
            df = a+b;
            d = w / (int)Math.pow(10, cd-1);
            w = w % (int)Math.pow(10, cd-1);
            cd = cd-1;
            y = y*10+d;
            cdy = (int) Math.log10(y) + 1;
            if(cdy == df){
                c = w;
                System.out.println(y);
                a = b; b = df; 
                y = 0;
            }
        }
        s1 = c; s2 = a; s3 = b;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n,i,x,af,bf,rx,cdx;
            af = 1; bf = 0; rx = 0;
            System.out.print("n: ");
            n = sc.nextInt();
            for(i=1;i<=n;i++){
                System.out.print("x: ");
                x = sc.nextInt();           
                cdx = (int) Math.log10(x) + 1;
                x = rx*(int)Math.pow(10,cdx)+x;
                salto(x,af,bf); rx = s1; af = s2; bf = s3;                     
            }
        }
    }
}
