package com.tutorial.Percabangan;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String input;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Masukan nama");
        input = inputScanner.next();

        switch(input) {
            case "deni":
                System.out.println("deni hadir");
                break;
            case "arum":
                System.out.println("harum hadir bu");
                break;
            case "dado":
                System.out.println("dado hadir bu");
                break;
            case "wahid":
                System.out.println("wahid hadir bu");
                break;
            default:
                System.out.println("hadir bu ");
        }
    }
}
