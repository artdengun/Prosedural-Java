package com.tutorial.PR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // kita bikin pengulangan bersarang
        while (true) {
            Scanner inputUser = new Scanner(System.in);
            System.out.print("Menghitung Lebar = ");
            int menghitungLebar = inputUser.nextInt();
            System.out.print("MenghitungPanjang = ");
            int menghitungPanjang = inputUser.nextInt();

            HitungSegitiga(menghitungPanjang, menghitungLebar);

            System.out.println("Hitung " + panjang(menghitungLebar, menghitungPanjang));
        }
    }

    private static int panjang( int lebar , int tinggi){
        int hitung = lebar * tinggi;
        return hitung;
    }


    private static void HitungSegitiga(int lebar, int panjang) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                if ((i + j) >= panjang) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
