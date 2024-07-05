package com.bit.demo;
 class Base {
     public int a;
 }

 class Derive extends Base {
     public int b;
 }
public class test1 {
    public static void main(String[] args) {
        Derive derive = new Derive();
        System.out.println(derive.a + " "+derive.b);
    }
}
