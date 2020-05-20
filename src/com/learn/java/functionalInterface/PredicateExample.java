package com.learn.java.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = num -> num%2 == 0;
    static Predicate<Integer> p2 = num -> num%5 == 0;

    static  void  predicateAnd(){
        System.out.println("Predicate And result : "+p1.and(p2).test(10));
        System.out.println("Predicate And result : "+p1.and(p2).test(9));
    }

    static  void  predicateOr(){
        System.out.println("Predicate Or result : "+p1.or(p2).test(9));
    }

    static  void  predicateNegate(){
        System.out.println("Predicate Negate result : "+p1.and(p2).negate().test(9));
    }

    public static void main(String[] args) {
        System.out.println("Predicate result : "+p1.test(10));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
