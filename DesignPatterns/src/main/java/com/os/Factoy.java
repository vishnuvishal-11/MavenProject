package com.os;

public class Factoy {

    public  Os getInstance(String Str){

        if(Str.equals("android"))
            return new Andorid();
        else if (Str.equals("ios"))
            return new Ios();
        else if (Str.equals("windows"))
            return new Windows();
        else
            System.out.print("no match");
        return null;
    }
}
