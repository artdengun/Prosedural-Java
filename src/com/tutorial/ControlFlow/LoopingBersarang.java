package com.tutorial.ControlFlow;

public class LoopingBersarang {
    public static void main(String[] args) {

        // kita akan belajar membuat looping bersarang

        for(int i = 0; i <5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for(int i = 0; i <5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 0; i <5; i++){
            for(int j = 0; j<5; j++){
                System.out.print("* ");
                if((i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n ");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <10; j++) {
                System.out.print("* ");
                if(i==j){
                    break;
                 }else if((i+j ) == 9 ){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if((x+y) <= 3||(x-y) >= 5){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
                if ((y-x) == 4){
                    break;
                }
                if ((x+y) == 12){
                    break;
                }
            }
            System.out.print("\n");
        }


        // Wajik bagian atas
        // 'i' membuat (*) baris ke bawah karena ada '\n'
        // 'j' membuat (*) baris ke kanan
        // 'k' membuat batas (*) yang akan dibuat
        int k = 9;
        for( int i = 0; i < k; i++){
            for( int j=0; j < k; j++){
                if ((i+j) >= 9){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for( int i = 0; i < k; i++){
            for( int j = 0; j < k; j++){
                if ((j-i) >= 0){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        int b = 9;
        for( int i = 0; i < b; i++){
            for( int j=0; j < b; j++){
                if ((i+j) >= 9){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for( int i = 0; i < b; i++){
            for( int j=0; j < b; j++){
                if ((j-i) >= 0){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}
