package com.tutorial.Percabangan;

import java.util.Scanner;

public class LatihanKalkulatorSwitch {
    public static void main(String[] args) {
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Masukan Bilangan A  = ");
        a = inputUser.nextFloat();
        System.out.print("masukan Operator    = ");
        operator = inputUser.next();
        System.out.print("Masukan Bilangan  B = ");
        b =  inputUser.nextFloat();

        // switch case digunakan untuk pemilihan menu
        // untuk char menggunakan '' untuk String ""
        switch (operator){
            case "+":
                hasil = a +  b;
                System.out.println(hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println(hasil);
            case "-":
                hasil = a - b;
                System.out.println(hasil);
            case "/":
                if(a == 0){
                    System.out.println("nilai A " + operator + " tidak boleh 0");
                }else if( b  == 0 ){
                    System.out.println("nilai B " + operator + " tidak boleh 0 ");
                }else{
                    hasil = a / b;
                    System.out.println(hasil);
                }
            case "%":
                hasil = a % b;
                System.out.println(hasil);
        }

    }
}
