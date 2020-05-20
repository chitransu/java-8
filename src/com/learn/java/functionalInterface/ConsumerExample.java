package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumer2 = student -> System.out.println(student);
    static Consumer<Student> consumer3 = student -> System.out.print(student.getName() + " ");
    static Consumer<Student> consumer4 = student -> System.out.print(student.getActivities() + " ");
    static Consumer<Student> consumer5 = student -> System.out.println(student.getGender());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printStudents(){
        studentList.forEach(consumer2);
    }

    public static void printNameAndActivities(){
        studentList.forEach(consumer3.andThen(consumer4)); // consumer chaining
    }

    public static void printNameAndActivitiesWithCondition(){
        System.out.println("Name  |"+ "      Activities       |" + " Gender");
        studentList.forEach((student) -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                consumer3.andThen(consumer4).andThen(consumer5).accept(student);
            }
        }); // consumer chaining with condition
    }

    public static void main(String[] args) {
        Consumer<String> consumer = string -> System.out.println(string.toUpperCase());
        consumer.accept("CHitranshu");
        //printStudents();
        //printNameAndActivities();
        printNameAndActivitiesWithCondition();
    }
}
