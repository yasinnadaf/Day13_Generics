package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {

        MaxFloat maxFloat  = new MaxFloat();
        System.out.println("Test case 1");
        maxFloat.maxValue(1.8F,4.6F,2.9F);
        System.out.println("Test case 2");
        maxFloat.maxValue(5.1F,4.5F,6.8F);
        System.out.println("Test case 3");
        maxFloat.maxValue(7.6F,10.0F,8.3F);
    }
}
