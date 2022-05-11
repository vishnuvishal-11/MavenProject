package org.example;
import com.os.*;

public class FactoryDesign {
    public static void main(String[] args) {

 Factoy factoy=new Factoy();
 Os obj=factoy.getInstance("ios");
  obj.version();


    }
}

