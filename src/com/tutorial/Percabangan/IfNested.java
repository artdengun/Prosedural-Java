package com.tutorial.Percabangan;

public class IfNested {
    public static void main(String[] args) {


        // nested if / belajar nested

        int a = 20;
        int b = 30;

        if(a == 20){
            if(b == 30){
                System.out.println("nilai a dan b, Nilai Anda Sama");
            }else{
                System.out.println("nilai b salah, dan nilai a benar");
            }
        }else{
            System.out.println("nilai salah semua");
        }


    }
}
