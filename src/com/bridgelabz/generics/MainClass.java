package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {

        MaxValue intMax = new MaxValue();
        System.out.println("Test case 1");
        intMax.maxValue(1,3,2);
        System.out.println("Test case 2");
        intMax.maxValue(5,4,6);
        System.out.println("Test case 3");
        intMax.maxValue(7,10,8);
    }
}
