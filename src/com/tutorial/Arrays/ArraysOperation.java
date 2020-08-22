package com.tutorial.Arrays;

import java.util.Arrays;
public class ArraysOperation {
    public static void main(String[] args) {
        // kita buat array biasa dulu
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];

        System.out.println("\n Memori ke \n ====================");
        printMemory(array1);
        printMemory(array2);

        System.out.println("\n Arrays \n ====================");
        print(array1);
        print(array2);

        // copy Menggunakan Looping

        System.out.println("\n Copy Menggunakan For \n ====================");
        for(int i =0; i < array1.length; i++){
                array2[i] = array1[i];
        }

        printMemory(array1);
        print(array1);
        printMemory(array2);
        print(array2);

        // Menggunakan copyOf Untuk  mencopy data arrays

        System.out.println("\n Copy Menggunakan copyOf \n ====================");
        int[] array3 = Arrays.copyOf(array1, 5);
        printMemory(array1);
        print(array1);
        printMemory(array3);
        print(array3);

        // Menggunakan copyOfRange untuk Mencopy data Arrays
        // dengan data awal dan data akhir yang di perlukan

        System.out.println("\n Copy Menggunakan copyRange \n =================");
        int[] array4 = Arrays.copyOfRange(array1, 2, 5);
        printMemory(array1);
        print(array1);
        printMemory(array4);
        print(array4);

        // fill Array
        // fill array digunakan untuk membuat data array sama
        System.out.println("\n Fill Array \n ===================");
        int[] array5 = new int[10];
        Arrays.fill(array5, 1);
        print(array5);
        Arrays.fill(array5, 5);
        print(array5);


        // Arrays Komparasi
        System.out.println("\n Komparasi \n =======================");
        int[] array6 = {7,8,9,1,2,3};
        int[] array7 = {7,8,9,1,2,3};

        System.out.println("Membandingkan dua buah array ");
        System.out.println(Arrays.equals(array6, array7));
        // sort
        // equals digunakan untuk membandingkan data
        if(Arrays.equals(array6, array7)){
            System.out.println(" Data Sama ");
        }else{
            System.out.println(" Data Berbeda");
        }

        System.out.println("\n ngecheck mana array yang lebih besar");
//        System.out.println(Arrays.compare(array6, array7));

        System.out.println("\n ngecheck mana index yang berbeda");
//        System.out.println(Arrays.mistmatch);


        // sort Array
        System.out.println("\n sort Arrays \n ==================");
        int[] array8 = {1,2,5,4,6,8,7,4};
        print(array8);
        Arrays.sort(array8);
        print(array8);

        //search array
        System.out.println("\n Search Array \n ===============");
        int angka =8;
        int posisi = Arrays.binarySearch(array8, angka);

        System.out.println("angka " + angka + " ada di index " + posisi);

        // tugas
        // sort kebalik
        // operasi tambah antara dua buah arrays
        // mengabungkan dua buah arrays





        // harusnya true dong kan sama
        // berarti kita harus menggunakan sort
//        if(array6 == array7){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }




    }
    private static void print(int[] printArray){
        System.out.println(" Array ke - " +  Arrays.toString(printArray));
    }

    private static void printMemory(int[] array){
        System.out.println("memori ke- " + array);
    }
}
