package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly reOnly=new RWOnly();
        reOnly.setName("sa");
        System.out.print(reOnly.getName());
        //name has private access in com.driver.RWOnly
    }
  
}