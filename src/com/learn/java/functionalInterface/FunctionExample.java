package com.learn.java.functionalInterface;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = name -> name.toUpperCase();
    static Function<String,String> function2 = name -> name.toLowerCase().concat("default");

    public static void main(String[] args) {
        //System.out.println("Result : "+function.apply("Java8"));

        System.out.println("Result of andThen is: "+function.andThen(function2).apply("java8"));

        System.out.println("Result of andThen is: "+function.compose(function2).apply("java8"));
    }
}
