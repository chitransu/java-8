package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {

    Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    BiConsumer<String, List<String>> bic = (name,activities) -> System.out.println(name + "--"+activities);

    Consumer<Student> studentConsumer = student -> {
        if (p1.and(p2).test(student)) {
            bic.accept(student.getName(),student.getActivities());
           // System.out.println(student.getName() + "--"+student.getActivities());
        }
    };

    void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        new PredicateAndConsumer().printNameAndActivities(students);
    }
}
