package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
        Predicate<Student> p2 = student -> student.getGpa() >= 4;
        BiPredicate<Integer,Double> bp = (gradeLevel,gpa) -> (gradeLevel >= 3 && gpa >= 4);
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                                                            .peek(student -> System.out.println(student.getName()))
                                                            .filter(p1)
                                                            .peek(student -> {
                                                                System.out.println("After First Filter "+student.getName());
                                                            })
                                                            .filter(p2)
                                                            .peek(student -> {
                                                                System.out.println("After Second Filter "+student.getName());
                                                            })
                                                           // .filter(student -> p1.and(p2).test(student))
                                                            //.filter(student -> bp.test(student.getGradeLevel(),student.getGpa()))
                                                             .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);
    }
}

// intermediate operations like filter
// terminal operations like collect