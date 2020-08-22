package com.tutorial.Arrays;

import java.util.Arrays;

public class ArraysDasar {
    public static void main(String[] args) {

        // arrays adalah kumpulan data
        // arrays dipanggil dengan index
        int[] arraysdasar = {1,2,3,4,5};


        // index arrays dimulai dengan angka 0
        // 0 -> 1 , 1 -> 2, 2 -> 3, 3 -> 4 , 4 -> 5
        System.out.println(arraysdasar[0]);
        System.out.println(arraysdasar[1]);
        System.out.println(arraysdasar[2]);
        System.out.println(arraysdasar[3]);
        System.out.println(arraysdasar[4]);


        // membuat array dengan membuat objek baru
        float[] arraysFloat = new float[5];

        // merubah array dengan mencantumkan index terkait
        arraysFloat[1] = 8.6f;
        arraysFloat[3] = 1.2f;
        arraysFloat[4] = 3.9f;

        System.out.println(arraysFloat[0]);
        System.out.println(arraysFloat[1]);
        System.out.println(arraysFloat[2]);
        System.out.println(arraysFloat[3]);
        System.out.println(arraysFloat[4]);


        // cara converter Menampilkan data arrays yang ada ke string
        System.out.println(" Jumlah Data 1 =    " + Arrays.toString(arraysdasar));
        System.out.println(" Jumlah Data 2 =    " + Arrays.toString(arraysFloat));
    }
}
