// ordenar un veector con el metodo merge

package com.mycompany.lab111.vec;
import java.util.Scanner;
public class e3_d5 {
    static public int v[] = new int[20];

    static public void llenar(int n){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1; i<=n; i++){
                System.out.print("v["+i+"] = ");
                v[i] = sc.nextInt();}}}

    static public void mostrar(int n){
        System.out.println("");
        System.out.print("v[] = | ");
        for(int i=1; i<=n; i++){
            System.out.print(v[i]+" | ");}
        System.out.println("\n");}

    static public void merSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merSort(left, mid);
            merSort(mid + 1, right);
            merge(left, mid, right);
        }}

    static public void merge(int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (v[i] < v[j]) {temp[k++] = v[i++];} 
            else {temp[k++] = v[j++];}}
        // Rellena los elementos restantes a la izquierda en temp
        while (i <= mid) {temp[k++] = v[i++]; }
        // Rellena los elementos restantes de la secuencia correcta en temp
        while (j <= right) {temp[k++] = v[j++];}
        // Copia todos los elementos en temp a la matriz original
        for (int m = 0; m < temp.length; m++) {
            v[m + left] = temp[m];}}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            int n = sc.nextInt(); 
            llenar(n);
            mostrar(n);
            merSort(0, n );
            mostrar(n);
            System.out.println("");}}}
