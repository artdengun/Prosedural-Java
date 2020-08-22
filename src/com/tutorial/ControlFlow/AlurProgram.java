package com.tutorial.ControlFlow;

public class AlurProgram {
    public static void main(String[] args) {
        int a = 0;

        while (true){
            a++;
            if(a == 10 ){
                break;
                // untuk mengehentikan program
            } else if(a == 5){
                continue;
                // artinya untuk melanjutkan
            } else if(a == 7 ){
                return;
            }
            System.out.println("ini adalah looping ke -" + a);
        }

    }
}
