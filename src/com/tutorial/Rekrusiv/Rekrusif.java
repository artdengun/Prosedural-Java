package com.tutorial.Rekrusiv;

import java.util.Scanner;

public class Rekrusif {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print(" Masukan NIlai : ");
        int nilai = inputUser.nextInt();
        System.out.println("anda memasukan nilai" + nilai);

        hasilJumlah(nilai);
        System.out.println("hasil void - " + nilai);
        int jumlah = hasilFaktorial(nilai);
        System.out.println("jumlah " + jumlah);
        int hasilPerkalian = hasilPerkalian(nilai);
        System.out.println(" hasil perkalian = " + hasilPerkalian);

    }

    private static int hasilFaktorial(int faktorial) {
        System.out.println("paremeter " + faktorial);
        if (faktorial == 1) {
            return faktorial;
        }
        return faktorial + hasilFaktorial(faktorial - 1);

    }


    private static int hasilPerkalian(int perkalian) {
        System.out.println("parameter" + perkalian);
        if (perkalian == 1) {
            return perkalian;
        }
        return perkalian * hasilPerkalian(perkalian - 1);
    }

    // fungsi rekrosiv dengan void
    private static void hasilJumlah(int penjumlahan) {
        System.out.println("masukan penjumlahan " + penjumlahan);
        if (penjumlahan == 0) {
            return;
        }

        penjumlahan--;

        hasilJumlah(penjumlahan);
    }
}
