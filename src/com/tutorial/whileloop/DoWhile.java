package com.tutorial.whileloop;

public class DoWhile {
    public static void main(String[] args) {


       int a = 0;
        boolean kondisi = true;
        System.out.println("AWAL PROGRAM");
        do {
            a++;
            System.out.println("anga ke-" + a);
            if (a == 10) {
                kondisi = false;
            }

        }while (kondisi);
            System.out.println("Akhir Program");


    }
}
