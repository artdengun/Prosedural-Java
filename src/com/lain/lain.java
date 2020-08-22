package com.lain;

public class lain {

    public static void accessLuarPublic(){
        System.out.println("akses: dari: Luar Public");
        accessLuarPrivate();
        accessLuarDefault();
        accessLuarProtected();
    }


    private static void accessLuarPrivate(){
        System.out.println("akses: dari: Luar Private");
    }


     static void accessLuarDefault(){
        System.out.println("akses: dari: Luar Default");
    }


    protected static void accessLuarProtected(){
        System.out.println("akses: dari: Luar Protected");
    }
}
