package com.tutorial.whileloop;

public class ForLoop {
    public static void main(String[] args) {
//
//        for(inisilisasi; kondisi; increment/decrement){
//            aksi
//        }

        System.out.println("PROGRAM AWAL 1");
        for(int a = 2; a <=10; a++){
            System.out.println(a);
        }
        System.out.println("PROGRAM AWAL 2");
        for(int a = 2; a < 10; a++){
            System.out.println(a);
        }

        System.out.println("program awal 3");
        for(int a= 10; a >= 2; a--){
            System.out.println(a);
        }

        System.out.println("program awal 4");
       int a = 2;
        for(; a < 10 ;) {
            System.out.println(a);
            a++;
        }

    //    System.out.println("akhir program");

    }
}
