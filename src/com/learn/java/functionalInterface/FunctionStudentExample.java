package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String,Double>> studentFunction = students -> {
        Map<String,Double> studentGpaMap = new HashMap<>();
        students.forEach(student -> {
            if(BiPredicateExample.biPredicate.test(student.getGradeLevel(),student.getGpa())) {
                studentGpaMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGpaMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
