package com.learn.java.stream_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.*;

public class StreamsMappingCollection {

    public static void main(String[] args) {
        List<String> nameList = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName,toList()));
        System.out .println(nameList);
        Set<String> nameSet = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName,toSet()));
        System.out .println(nameSet);
    }
}
