package com.PrototypeDesign;

public class Book {
   private  int bookid;
    private String bookName;

     @Override
     public String toString() {
          return "Book{" +
                  "bookid=" + bookid +
                  ", bookName='" + bookName + '\'' +
                  '}';
     }

     public int getBookid() {
          return bookid;
     }

     public void setBookid(int bookid) {
          this.bookid = bookid;
     }

     public String getBookName() {
          return bookName;
     }

     public void setBookName(String bookName) {
          this.bookName = bookName;
     }
}
