package com.learn.java.stream_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAverageExample {

    public static int sum(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double average(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Sum of Notebooks : "+sum());
        System.out.println("Average of Notebooks : "+average());
    }
}
