package com.tutorial.Rekrusiv;

import java.util.Scanner;

public class RekrusifBercabangan {
    public static void main(String[] args) {
        Scanner inputNilai = new Scanner(System.in);
        System.out.println("masukan nilai = ");
        int nilai = inputNilai.nextInt();
        int niaiFibonacci = fibonacci(nilai, "atas");

        System.out.println("nilai fibonacci adalah-" + nilai + " adalah " + niaiFibonacci);
    }

    private static int fibonacci(int n, String daun){
        System.out.println("daun" + daun);
        System.out.println("fibonacci ke- n" +n);

        if(n== 1 || n == 0){
            return n;
        }else {
            return fibonacci(n-1, "kiri") + fibonacci(n-2, "kanan");
        }
    }
}
