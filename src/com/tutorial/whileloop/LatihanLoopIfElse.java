package com.tutorial.whileloop;

import java.util.Scanner;

public class LatihanLoopIfElse {
    public static void main(String[] args) {
        // nilai awal
        Scanner inputNilai;
        int nilaiAwal,nilaiAkhir, total;

        inputNilai = new Scanner(System.in);
        System.out.print("Masukan nilai A = ");
        nilaiAwal = inputNilai.nextInt();
        System.out.print("Masukan nilai B = ");
        nilaiAkhir = inputNilai.nextInt();



        total = 0;

            // looping Menggunakan WhileLoop

        while(nilaiAwal <= nilaiAkhir ){
            total = total + nilaiAwal;
            System.out.println(nilaiAwal + " + = " + total  );
            nilaiAwal++;
        }


          // Looping Menggunakan Do WHILE
        total = 0;
        do {
            total = total + nilaiAwal;
            System.out.println(nilaiAwal + " nilai akhir = " + total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);
                System.out.println("berakhir program");

            // Looping Menggunakan For
        for(total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++){
            total = total + nilaiAwal;
            System.out.println(nilaiAwal +  " total =  " + total);
        }


    }
}
