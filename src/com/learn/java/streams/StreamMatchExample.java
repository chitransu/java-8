package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamMatchExample {

    public static boolean allMatch(){
       // return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa() >= 3.5); // true
        return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa() >= 3.9); // false
    }

    public static boolean anyMatch(){
       // return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa() >= 4.1); // false
        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa() >= 4.0); // true
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa() >= 4.2); // true
    }

    public static void main(String[] args) {
        System.out.println("Result Of allMatch "+allMatch());
        System.out.println("Result Of anyMatch "+anyMatch());
        System.out.println("Result Of noneMatch "+noneMatch());
    }
}
