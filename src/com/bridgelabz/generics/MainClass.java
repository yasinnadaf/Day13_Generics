package com.bridgelabz.generics;

public class MainClass {
    public static void main(String[] args) {

        MaxValue<Integer> maxValue = new MaxValue<>(5,4,3);
        maxValue.testMaximum();
        MaxValue<Float> maxValue1 = new MaxValue<>(5.2F,8.3F,3.2F);
        maxValue1.testMaximum();
        MaxValue<String> maxValue2 = new MaxValue<>("Peach","Apple","Zach");
        maxValue2.testMaximum();
    }

}
