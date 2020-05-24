package com.learn.java.stream_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static Map<String, List<Student>> groupStudentByGender(){
        return StudentDataBase.getAllStudents().stream().collect(groupingBy(Student ::getGender));
    }

    public static Map<String,List<Student>> customizedGroupingBy(){
        return StudentDataBase.getAllStudents().stream().collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static Map<Integer,Map<String,List<Student>>> secondLevelGrouping(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
    }

    public static Map<String,Integer> secondLevelGrouping2(){
        return StudentDataBase.getAllStudents()
                .stream().collect(groupingBy(Student::getName,summingInt(Student::getNoteBooks)));
    }

    public static LinkedHashMap<String, Set<Student>> threeArgumentGroupBy(){
        return StudentDataBase.getAllStudents().stream().collect(groupingBy(Student::getName,LinkedHashMap::new,toSet()));
    }

    public static void main(String[] args) {
        System.out.println(groupStudentByGender());
        System.out.println(customizedGroupingBy());
        System.out.println(secondLevelGrouping());
        System.out.println(secondLevelGrouping2());
        System.out.println(threeArgumentGroupBy());
    }
}
