package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj=new RWOnly();
    //System.out.println(obj.name);
   /*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The field RWOnly.name is not visible

        at com.driver.Main.main(Main.java:6)*/
    obj.setter("Hareesh");
    System.out.println(obj.getter());
  }
}