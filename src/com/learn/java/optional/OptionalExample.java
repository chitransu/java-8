package com.learn.java.optional;

// It is introduced in java 8 to represent a Non-null value
// Avoids Null Pointer Exception and un - necessary Null checks
// Inspired from the new languages such as scala , grovvy etc

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        //Student student = StudentDataBase.studentSupplier.get();
         Student student = null;
        if(student != null){
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameUsingOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            // return Optional.ofNullable(studentOptional.get().getName());
            return studentOptional.map(Student::getName); // Optional<String>
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
          //  if(getStudentName() != null){
              //  System.out.println("Length of student name : "+getStudentName().length());
          //  }else{
              //  System.out.println("Name not found");
          //  }
        if(getStudentNameUsingOptional().isPresent()){
            System.out.println("Length of student name : "+getStudentNameUsingOptional().get().length());
        }else{
            System.out.println("Name not found");
        }
    }
}
