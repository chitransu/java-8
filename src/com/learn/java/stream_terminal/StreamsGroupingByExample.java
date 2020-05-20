package com.learn.java.stream_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {

    public static Map<String, List<Student>> groupStudentByGender(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student ::getGender));
    }

    public static Map<String,List<Student>> customizedGroupingBy(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OOUTSTANDING" : "AVERAGE"));
    }

    public static void main(String[] args) {
        System.out.println(groupStudentByGender());
        System.out.println(customizedGroupingBy());
    }
}
