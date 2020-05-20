package com.learn.java.functionalInterface;

import com.learn.java.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> supplier = () -> new Student("Emily",3,4.0,"female", 12, Arrays.asList("swimming", "gymnastics","aerobics"));

    public static void main(String[] args) {
        System.out.println(supplier.get());
    }
}
