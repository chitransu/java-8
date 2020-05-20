package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyAndFindFirstExample {

    // There is not significant difference between findAny and FindFirst if we are using stream
    // the actual difference can be seen in parallel stream.

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).findAny();
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 4.0).findFirst();
    }

    public static void main(String[] args) {
            System.out.println("Result of findAny "+findAny());
            System.out.println("Result of findFirst "+findFirst());
    }
}
