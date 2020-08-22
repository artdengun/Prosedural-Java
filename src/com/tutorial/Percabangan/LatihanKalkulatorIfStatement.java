package com.tutorial.Percabangan;

import java.util.Scanner;

public class LatihanKalkulatorIfStatement {
    public static void main(String[] args) {

        Scanner inputUser;
                float x,y,hasil;
                char operator;
        inputUser = new Scanner(System.in);
        System.out.println("masukan nilai A ");
        x = inputUser.nextInt();
        System.out.println("Masukan Operator ");
        operator = inputUser.next().charAt(0);
        System.out.println("masukan nilai B");
        y = inputUser.nextInt();

        System.out.println("hasil " + x + operator + y);
        // + , - , * , / , %
        if(operator == '+'){
            hasil = x + y;
            System.out.println( "Jumlah " +  hasil);
        } else if(operator == '-'){
            hasil = x - y;
            System.out.println( "Jumlah " +  hasil);
        } else if(operator == '*'){
            hasil = x * y;
            System.out.println( "Jumlah " +  hasil);
        } else if(operator == '/'){
            if(x == 0){
                System.out.println("nilai x tidak terhingga");
            }else if(y == 0){
                System.out.println("nilai y tidak terhingga");
            }else{
                hasil = x / y;
                System.out.println( "Jumlah " +  hasil);
            }
        } else if(operator == '%'){
            hasil = x % y;
            System.out.println( "Jumlah " +  hasil);
        }else{
            System.out.println("operator tidak ditemukan");
        }
    }
}
