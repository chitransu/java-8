package com.learn.java.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> sum = (a,b) -> (a+b);
    static BinaryOperator<Integer> mul = (a,b) -> (a*b);
    static Comparator<Integer> comp = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {
        System.out.println("Sum : "+sum.apply(2,3));
        System.out.println("Mul : "+mul.apply(2,3));
        //BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comp);
        System.out.println("Result of MaxBy is : "+BinaryOperator.maxBy(comp).apply(5,10));
        System.out.println("Result of MinBy is : "+BinaryOperator.minBy(comp).apply(5,10));
    }
}
