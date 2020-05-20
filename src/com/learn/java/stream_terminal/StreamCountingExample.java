package com.learn.java.stream_terminal;

import com.learn.java.data.StudentDataBase;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamCountingExample {

    public static long count(){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9)
                                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("count is : "+count());
    }
}
