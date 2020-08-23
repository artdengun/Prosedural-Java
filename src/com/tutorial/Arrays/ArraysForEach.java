package com.tutorial.Arrays;

import  java.util.Arrays;
public class ArraysForEach {
    public static void main(String[] args) {

        int[] arraysNew = {10,11,12,45,12,45,12,12,11};

        // pengulangan standar dengan for arrays
        System.out.println("======================");
        System.out.println("arrays standar");
        System.out.println("======================");
        for(int i = 0; i < 9; i++){
            System.out.println(" pengulangan ke " + i + " arrays ke- " + arraysNew[i]);
        }
        // pengulangan array
        //  pengulangan dengan menggunakan arrays
        System.out.println("======================");
        System.out.println("pengulangan dengan arrays ");
        System.out.println("======================");
        for(int i = 0; i < arraysNew.length; i++){

            System.out.println(" pengulangan ke " + i + " arrays ke- " + arraysNew[i]);
        }

        // pengulangan dengan menggunakan collection -> Arrays
        System.out.println("======================");
        System.out.print("lopping dengan foreach ");
        System.out.println("======================");
        for(int angka : arraysNew ){
            System.out.println(" Pengulangan ke-" + angka);
            }

    }
}
