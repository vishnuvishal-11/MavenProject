package org.example;

public class Main {
    public static void main(String[] args) {
      Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println("In Main Class : "+ s1);
        System.out.println(s1.equals(s2));
        System.out.println("s1.getClass : "+s1.getClass());
        s2.display();
   Thread t1 =new Thread(new Runnable() {
       @Override
       public void run() {
           Singleton s3=Singleton.getInstance();
       }
   });
        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton s3=Singleton.getInstance();
            }
        });
        t1.start();
        t2.start();

}
}


class Singleton{
    static Singleton singleton;//Early Instance
  private   Singleton(){   //private is must
      System.out.println("Instance created");
    }
  public static  Singleton getInstance(){   //synchronized-> using here makes resources wastage
      if(singleton==null){
          synchronized (Singleton.class){
              if(singleton==null)             //double-checking is preferred
          singleton = new Singleton() ;
          }
      }
      return singleton;

  }
public void display(){
      System.out.println("Single Designer class object's Instance: "+ singleton);
    //Singleton s3=Singleton.getInstance();
    //System.out.println(s3.equals(singleton));
}

    }
