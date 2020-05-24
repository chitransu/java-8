package com.learn.java.optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    public static String optionalOrElseGet(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    public static String optionalOrElseThrow(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("Data not Found"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Student optionalOrElse : "+optionalOrElse());
        System.out.println("Student optionalOrElseGet : "+optionalOrElseGet());
        System.out.println("Student optionalOrElseThrow : "+optionalOrElseThrow());
    }
}
