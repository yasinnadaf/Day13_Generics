package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {

        MaxString maxString  = new MaxString();
        System.out.println("Test case 1");
        maxString.maxValue("Apple","Peach","Banana");
        System.out.println("Test case 2");
        maxString.maxValue("Apple","Zach","Banana");
        System.out.println("Test case 3");
        maxString.maxValue("Apple","Banana","Class");
    }
}
