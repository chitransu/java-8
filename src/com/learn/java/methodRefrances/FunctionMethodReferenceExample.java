package com.learn.java.methodRefrances;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    // Method reference is used to write lambda expressions in more shorten way
    // Or method reference can be used as a shortcut for lambda expressions

    static Function<String,String> toUppercaseLambda = str -> str.toUpperCase();
    static Function<String,String> getToUppercaseMethodReference = String :: toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUppercaseLambda.apply("welcome"));
        System.out.println(getToUppercaseMethodReference.apply("welcome"));
    }
}
