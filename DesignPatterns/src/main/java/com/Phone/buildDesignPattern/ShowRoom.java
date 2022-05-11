package com.Phone.buildDesignPattern;

public class ShowRoom {
    public static void main(String[] args) {
        Phone p= new BuilderPhone().setOs("Android").setRam(4).setProcessor("Dual-core").getPhone();
      System.out.println(p);


    }
}
