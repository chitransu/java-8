package com.learn.java.methodRefrances;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p = RefactorMethodReferenceExample :: greaterThenGradeLevel ;

    static boolean greaterThenGradeLevel(Student student){
        return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(p.test(StudentDataBase.studentSupplier.get()));
    }
}
