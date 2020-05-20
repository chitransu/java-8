package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = (students,predicate) -> {
        Map<String,Double> studentGpaMap = new HashMap<>();
        students.forEach(student -> {
            if(predicate.test(student)){
                studentGpaMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGpaMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p2));
    }
}
