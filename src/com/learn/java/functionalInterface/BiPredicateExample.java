package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    static BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpaLevel) -> gradeLevel >= 3 && gpaLevel >= 3.9;
    BiConsumer<String,List<String>> biConsumer = (name,activities) -> System.out.println(name + " "+activities);

    Consumer<Student> studentConsumer = student -> {
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            biConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        new BiPredicateExample().printNameAndActivities(students);
    }
}
