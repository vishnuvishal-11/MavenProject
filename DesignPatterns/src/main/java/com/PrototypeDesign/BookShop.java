package com.PrototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

  private   String ShopName;
   List<Book> book= new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public List<Book> getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "ShopName='" + ShopName + '\'' +
                ", book=" + book +
                '}';
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
    public void display(){

        for(int i=0;i<10;i++){
            Book b=new Book();
            b.setBookid(i);
            b.setBookName("book"+i);
            getBook().add(b);

        }
    }

 //   @Override
  //  protected Object clone() throws CloneNotSupportedException {
  //      return super.clone();
   // }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
       BookShop b=new BookShop();
       for(Book bs: this.getBook()){

           b.getBook().add(bs);
       }
       return b;
    }
}
