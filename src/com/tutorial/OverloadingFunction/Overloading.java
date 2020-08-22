package com.tutorial.OverloadingFunction;

public class Overloading {
    public static void main(String[] args) {


        printAngka(2,5,74);

    }

    private static int printSort(int sort1, float sort2, long sort3){
        int hasilSort = (int)(sort1 + sort2 + sort3);
        return hasilSort;
    }

    private static float printNumber(float number1, float number2, int number3){
        float hasil = number1 + number2 + number3;
        return  hasil;
    }

    private static float printAngka(float angkaa1, int angkaa2){
        return angkaa1 + angkaa2;
    }

    // syaratnya tipe datanya harus berbeda 
    // overloading adalah fungsi yang sama yang didalamnya dapat banyak parameter
    public static void printAngka(int angka, int angka1, int angka2) {
        System.out.println(" angka ke- " + angka + angka1 + angka2);
    }
    public static void printAngka(int angka, int angka1) {
        System.out.println(" angka ke- " + angka + angka1);
    }
    public static void printAngka(int angka){
        System.out.println(" angka ke- " + angka);
    }
}
