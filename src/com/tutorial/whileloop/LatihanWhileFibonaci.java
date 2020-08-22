package com.tutorial.whileloop;

import java.util.Scanner;

public class LatihanWhileFibonaci {
    public static void main(String[] args) {

        int fibonacciNilai, FibonacciNilai1, FibonacciNilai2, n;

        Scanner inputNilai = new Scanner(System.in);
        System.out.println("Masukan Nilai Fibonacci = ");
        n = inputNilai.nextInt();

        FibonacciNilai2 = 0;
        FibonacciNilai1 = 1;
        fibonacciNilai = 1;
//
//        pengulangan menggunakan for
//
//        for(int i = 1; i <= n ; i++) {
//            System.out.println("Nilai n " + n + " Fibonacci Nilai = " + fibonacciNilai);
//            fibonacciNilai = FibonacciNilai2 + FibonacciNilai1;
//            FibonacciNilai2 = FibonacciNilai1;
//            FibonacciNilai1 = fibonacciNilai;
//        }

//              Pengulangan Mengunakan While
//
//        int nilai = 1;
//        while (nilai <= n){
//            System.out.println("Nilai n " + n + " Fibonacci Nilai = " + fibonacciNilai);
//            fibonacciNilai = FibonacciNilai2 + FibonacciNilai1;
//            FibonacciNilai2 = FibonacciNilai1;
//            FibonacciNilai1 = fibonacciNilai;
//            nilai++;
//        }

        int nilai = 1;

        do{
            System.out.println("nilai n =  " + n + " fb = " + fibonacciNilai);
            fibonacciNilai = FibonacciNilai2 + FibonacciNilai1;
            FibonacciNilai2 = FibonacciNilai1;
            FibonacciNilai1 = fibonacciNilai;
            nilai++;
        }while(nilai <= n);System.out.println("program berakhir");
    }
}
