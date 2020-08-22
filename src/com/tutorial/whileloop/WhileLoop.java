package com.tutorial.whileloop;

public class WhileLoop {
    public static void main(String[] args) {
//        while (kondisi) {
//            aksi
//        }

         int a = 0;
         boolean input = true;
         System.out.println("awal program");
        while (input){
            System.out.println("while loop ke-" + a );
            a++;
            if(a == 10){
                input = false;
            }
        }
    }
}
