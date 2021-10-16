package ru.dataart.academy.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(" the sum is : " + Calculator.getSum(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2)));
        System.out.println(" the odd elements are : " + Calculator.getOddElements(Arrays.asList(1, 2, 3, 4)));
        System.out.println(" the bounds are : " + Calculator.getBounds(Arrays.asList(1, 2, 3, 4)));
    }

}