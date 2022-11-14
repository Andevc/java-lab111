// Matriz en U 

package com.mycompany.lab111.matrices.generar_matrices; 
import java.util.Scanner;
public class e3 {
 
    static public int v[][] = new int[20][20];

    static public void mostrar(int n){
        System.out.print("v[][] :");
        for(int i=1; i<=n;i++){
            System.out.println("");
            
            System.out.print("\t|   ");
            for(int j=1;j<=n;j++){
                System.out.print(v[i][j]+"\t|   " );
            }
        }
        System.out.println("\n");
    }

    static public void matriz_u(int n){ // arriba -> derecha -> abajo
        int c = 1,i,j,k,ls = n;
        for(k = 1; k <= n/2; k++){
            j = k;
            for(i = n; i >= k; i--) {v[i][j] = c ; c = c + 1;}
            i = k;
            for(j = k+1; j <= ls; j++) {v[i][j] = c ; c = c + 1;}
            j = ls;
            for(i = k+1; i <= n; i++) {v[i][j] = c ; c = c + 1;}
            ls = ls-1;
        }
        if(n%2 == 1){
        j = k;
        for(i = n; i >= k ; i--){v[i][j] = c ; c = c + 1;}}
    }

    static public void matriz_u2(int n){ // abajo -> derecha -> arriba
        int c = 1,i,j,k,ls = n;
        for(k = 1; k <= n/2; k++){
            j = k;
            for(i = 1; i <= ls; i++) {v[i][j] = c ; c = c + 1;}
            i = ls;
            for(j = k+1; j <= ls; j++) {v[i][j] = c ; c = c + 1;}
            j = ls;
            for(i = ls-1; i >= 1; i--) {v[i][j] = c ; c = c + 1;}
            ls = ls-1;
        }
        if(n%2 == 1){
        j = k;
        for(i = 1; i <= ls ; i++){v[i][j] = c ; c = c + 1;}}
    }

    static public void matriz_u3(int n){ //dereca -> abajo -> izquierda
        int c = 1,i,j,k,ls = n;
        for(k = 1; k <=n/2; k++){
            i = k;
            for(j = 1; j <= ls; j++) {v[i][j] = c ; c = c + 1;}
            j = ls;
            for(i = k+1; i<=ls; i++) {v[i][j] = c ; c = c + 1;}
            i = ls;
            for(j = ls-1; j>=1; j--) {v[i][j] = c ; c = c + 1;}
            ls = ls-1;
        }
        if(n%2==1){ 
            i = k;
            for(j = 1; j <= ls; j++) {v[i][j] = c ; c = c + 1;}
        }
    }

    static public void matriz_u4(int n){ //izquierda -> abajo -> derecha
        int c = 1,i,j,k,ls = n;
        for(k = 1; k <=n/2; k++){
            i = k;
            for(j = n; j >= k; j--) {v[i][j] = c ; c = c + 1;}
            j = k;
            for(i = k + 1; i <= ls; i++) {v[i][j] = c ; c = c + 1;}
            i = ls;
            for(j = k+1; j<=n; j++) {v[i][j] = c ; c = c + 1;}
            ls = ls-1;
        }
        if(n%2==1){
            i = k;
            for(j = n; j >= k; j--) {v[i][j] = c ; c = c + 1;}
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int op;
            System.out.print("n: ");
            int n = sc.nextInt();
        
        do{
            System.out.println("1. Matriz en u 1");
            System.out.println("2. Matriz en u 2");
            System.out.println("3. Matriz en u 3");
            System.out.println("4. Matriz en u 4");
            System.out.println("5. Salir");
            System.out.print("op: ");
            op = sc.nextInt();
            switch(op){
                case 1:    
                        matriz_u(n);
                        mostrar(n);
                        System.out.println("\n");
                        break;
                case 2:
                        matriz_u2(n);
                        mostrar(n);
                        System.out.println("\n");
                        break;
                case 3: 
                        matriz_u3(n);
                        mostrar(n);
                        System.out.println("\n");
                        break;
                case 4: 
                        matriz_u4(n);
                        mostrar(n);
                        System.out.println("\n");
                        break;
                }
            }while(op != 5);
        }
    }    
}
