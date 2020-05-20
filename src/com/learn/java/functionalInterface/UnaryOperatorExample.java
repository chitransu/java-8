package com.learn.java.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = str -> {
       // StringBuffer sb= new StringBuffer(str);
       // return sb.reverse().toString();
        return new StringBuffer(str).reverse().toString();
    };

    static UnaryOperator<String> unaryOperator2 = str -> new StringBuffer(str).reverse().toString();

    public static void main(String[] args) {
        System.out.println(unaryOperator2.apply("welcome"));
    }
}
