package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                                        .sorted(Comparator.comparing(Student::getName))
                                        .collect(Collectors.toList());
    }

    static List<Student> sortStudentByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student :: getGpa))
                .collect(Collectors.toList());
    }

    static List<Student> sortStudentByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student :: getGpa).reversed())
                .collect(Collectors.toList());
    }

    static List<Student> sortStudentByNameAndGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getGpa))
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println("Sort Student By Name");
        sortStudentByName().forEach(System.out::println);
        System.out.println("Sort Student By GPA");
        sortStudentByGpa().forEach(System.out::println);
        System.out.println("Sort Student By GPA Desc");
        sortStudentByGpaDesc().forEach(System.out::println);
        System.out.println("Sort Student By Name and GPA");
        sortStudentByNameAndGpa().forEach(System.out::println);
    }
}
