package com.tutorial.Percabangan;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {

        int input,y;

        Scanner inputUser = new Scanner(System.in);
        System.out.println("masukan nilai : ");
        input = inputUser.nextInt();

        y = (input==10) ? (input*input) : (input/2);
        System.out.println(" Nilai anda adalah " + y);
    }
}
