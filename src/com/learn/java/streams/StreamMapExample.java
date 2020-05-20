package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamMapExample {


    static List<String> getStudentNameList(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) // map function is used to convert one type to another
                .map(String::toUpperCase) // map can also used to perform some operation as here it perform toUpperCase operation
                .collect(toList());     // here map converts from Student to String
    };

    static Set<String> getStudentNameSet(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) // map function is used to convert one type to another
                .map(String::toUpperCase) // map can also used to perform some operation as here it perform toUpperCase operation
                .collect(toSet());     // here map converts from Student to String
    };

    //static Map<Integer,String> getStudentNameMap(){
       // return StudentDataBase.getAllStudents().stream()
                //.map(Student::getName) // map function is used to convert one type to another
               // .map(String::toUpperCase) // map can also used to perform some operation as here it perform toUpperCase operation
               // .collect(toMap());     // here map converts from Student to String
    //};

    public static void main(String[] args) {
        System.out.println(getStudentNameList());
        System.out.println(getStudentNameSet());
    }
}
