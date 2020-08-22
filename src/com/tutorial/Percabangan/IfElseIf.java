package com.tutorial.Percabangan;

public class IfElseIf {
    public static void main(String[] args) {

        int nilai = 50;

        System.out.println("nilai anda " + nilai);

        if(nilai ==10){
            System.out.println("aksi 1 ");
        } else if(nilai == 15){
            System.out.println("aksi 2");
        }else if(nilai == 20){
            System.out.println("aksi 3");
        }else if(nilai == 25){
            System.out.println("aksi 4");
        }else if(nilai == 30){
            System.out.println("aksi 5");
        }else if(nilai == 35){
            System.out.println("aksi 6");
        }else if(nilai == 40){
            System.out.println("aksi 7");
        }else if(nilai == 45){
            System.out.println("aksi 8");
        }else{
            System.out.println("tidak ada nilai yang cocok");
        }

        System.out.println("program berakhir");
    }
}
