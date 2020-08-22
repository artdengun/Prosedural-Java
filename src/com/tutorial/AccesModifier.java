package com.tutorial;

import com.lain.lain;

public class AccesModifier {
    public static void main(String[] args) {
        // access modifier
        // public, private, default, protected

        accessPublic();
        accessPrivate();
        accessDefault();
        accessProtected();

        // kita panggil dari luar class

        lain.accessLuarPublic();

    }

    // dapat di akses oleh siapapun
    // didalam kelas apapun
    public static void accessPublic(){
        System.out.println("accesPublic");
    }

    // ini hanya dapat diakses oleh class yang bersangkutan
    // tidak bisa di access diluar package dan kelas yang sama
    private static void accessPrivate(){
        System.out.println("accessPrivate");
    }

    //  ini hanya dapat diakses oleh class dalam package yang sama
    static void accessDefault(){
        System.out.println("accessDefault");
    }

    // ini hanya dapat diakses oleh class dalam package yang sama
    // dan subclassnya
    protected static void accessProtected(){
        System.out.println("accessProtected");
    }


}
