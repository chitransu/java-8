package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p = student -> student.getGradeLevel() >=3;
    static Predicate<Student> p2 = student -> student.getGpa() >=3.9;
    static Consumer<Student> c = student -> System.out.println(student);
    static List<Student> students = StudentDataBase.getAllStudents();

    static void predicateStudentAnd(){
        students.forEach(student -> {
            if(p.and(p2).test(student)){
                //c.accept(student);
                System.out.println(student);
            }
        });
    }

    static void predicateStudentOr(){
        students.forEach(student -> {
            if(p.or(p2).test(student)){
                //c.accept(student);
                System.out.println(student);
            }
        });
    }

    static void predicateStudentNegate(){
        students.forEach(student -> {
            if(p.or(p2).negate().test(student)){
                //c.accept(student);
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        students.forEach(student -> {
            if(p.test(student)){
               // c.accept(student);
                System.out.println(student);
            }
        });
        System.out.println("---------------------");
        predicateStudentAnd();
        System.out.println("---------------------");
        predicateStudentOr();
        System.out.println("---------------------");
        predicateStudentNegate();
    }

}
