package com.tutorial.Percabangan;

public class Latihan {
    public static void main(String[] args) {

        int a = 50;
        int b = 10;
        int c = 870;

        if(a == 20){
            System.out.println("nilai A anda sama");
            if(b == 30){
                System.out.println("nilai a dan B anda benar ");
                if(c == 40){
                    System.out.println("nilai A, B dan C anda  benar semua");
                }else{
                    System.out.println("nilai C anda salah ");
                }
            }
            else{
                System.out.println("nilai anda tidak sama dengan b dan c ");
            }
        }else{
            System.out.println("nilai salah semua ");
        }
    }
}
