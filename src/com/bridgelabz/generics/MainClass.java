package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {

        MaxValue maxValue = new MaxValue();
        System.out.println("Test case 1");
        maxValue.maxValue(1,3,2);
        System.out.println("Test case 2");
        maxValue.maxValue(5,4,6);
        System.out.println("Test case 3");
        maxValue.maxValue(7,10,8);
        System.out.println("Test case 1");
        maxValue.maxValue(1.8F,4.6F,2.9F);
        System.out.println("Test case 2");
        maxValue.maxValue(5.1F,4.5F,6.8F);
        System.out.println("Test case 3");
        maxValue.maxValue(7.6F,10.0F,8.3F);
        System.out.println("Test case 1");
        maxValue.maxValue("Apple","Peach","Banana");
        System.out.println("Test case 2");
        maxValue.maxValue("Apple","Zach","Banana");
        System.out.println("Test case 3");
        maxValue.maxValue("Apple","Banana","Class");
    }
}
