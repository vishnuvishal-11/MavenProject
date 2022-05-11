package com.PrototypeDesign;

public class Control {
    public static void main(String[] args) throws Exception {


        BookShop bookShop=new BookShop();
        bookShop.setShopName("Royal Book Store");
        bookShop.display();
        //System.out.println(bookShop);

        BookShop bookShop2=bookShop.clone();
        bookShop.getBook().remove(4);
        bookShop2.setShopName("Cloned Shop");
        System.out.println(bookShop);
       System.out.println(bookShop2);
    }


}


