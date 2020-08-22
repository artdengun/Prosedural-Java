package com.tutorial.Percabangan;

public class If {
    public static void main(String[] args) {
        int nilai = 20;

        System.out.println(nilai);
        if(nilai == 21){
            System.out.println("Anda lewat jalur true ");
            System.out.println("nilai sesuai atau kurang dari 20");
        } else {
            System.out.println("anda lewat jalur false");
            System.out.println("nilai lebih dari 20");
        }

        System.out.println("Program Selesai");
    }
}
