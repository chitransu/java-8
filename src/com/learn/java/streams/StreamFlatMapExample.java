package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    static List<String> printStudentActivities(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                            .map(Student::getActivities ) //Stream<List<String>
                            .flatMap(List::stream) // Stream<String>
                           // .distinct()  // it will result the distinct activities
                           // .sorted() // it provides default sorting in asc
                            // .sorted((s1,s2) -> -s1.compareTo(s2)) // sort in asc
                            .sorted((s1,s2) -> -s1.compareTo(s2))  // sort in desc
                            .collect(toList());
    }

    static Long getStudentActivitiesCount(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities ) //Stream<List<String>
                .flatMap(List::stream) // Stream<String>
                .distinct()  // it will result the distinct activities
                .count();
    }

    public static void main(String[] args) {

        System.out.println(printStudentActivities());

        System.out.println("Total no of activities : "+getStudentActivitiesCount());
    }
}
