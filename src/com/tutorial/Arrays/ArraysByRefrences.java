package com.tutorial.Arrays;

import java.util.Arrays;
public class ArraysByRefrences {
    public static void main(String[] args) {


        System.out.println("Lokasi Memory berbeda ");

        int[] arraysRefrences = {1,2,3,4,5,6,7};
        int[] arraysRefrences2 = new int[5];
        int[] arraysRefrences3 = new int[4];

        System.out.println(" Data Arrays -> " + arraysRefrences.length);
        System.out.println(" Data Arrays -> " + arraysRefrences2.length);
        System.out.println(" Data Arrays -> " + arraysRefrences3.length);

        System.out.println(arraysRefrences);
        System.out.println(arraysRefrences2);
        System.out.println(arraysRefrences3);

        // lokasi folder memori yang sama Refrences
        // yang mengacu pada arrays yang pertama
        System.out.println(" lokasi memori yang sama ");
        arraysRefrences2=arraysRefrences;
        arraysRefrences3=arraysRefrences;
        System.out.println(arraysRefrences);
        System.out.println(arraysRefrences2);

        // isi data arrays
        System.out.println("melihat jumlah data Arrays ");
        System.out.println(" Data Arrays -> " + arraysRefrences.length);
        System.out.println(" Data Arrays -> " + arraysRefrences2.length);
        System.out.println(" Data Arrays -> " +arraysRefrences3.length);

        arraysRefrences[0] = 125;
        arraysRefrences2[3] = 100;
        System.out.println("Data Arrays ->1 " + Arrays.toString(arraysRefrences));
        System.out.println("Data Arrays ->2 " + Arrays.toString(arraysRefrences2));
        System.out.println("Data Arrays ->3 " + Arrays.toString(arraysRefrences3));

        System.out.println(" Data yang berubah ");
        ubahArray(arraysRefrences2);
        System.out.println(" Data Arrays yang berubah " + Arrays.toString(arraysRefrences));
        System.out.println(" Data Arrays yang berubah " + Arrays.toString(arraysRefrences2));
        System.out.println(" Data Arrays yang berubah " + Arrays.toString(arraysRefrences3));

    }
        // method yang argumentnya dalah refrences , pass by refrence ( refrensi )
        // int[] dataArrays -> disebu pas by refrence
        // bukan method pas by value
        // int dataArray -> disebut pas by value
    private static void ubahArray(int[] dataArray){
        dataArray[0] = 100;
    }
}
