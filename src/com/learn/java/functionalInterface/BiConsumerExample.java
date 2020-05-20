package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    static void printNameAndActivities(){
        BiConsumer<String,List<String>> biConsumer2 = (name,activities) -> System.out.println(name + " : "+activities);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> biConsumer2.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (s1,s2) -> System.out.println(s1 +" , "+s2);
        BiConsumer<Integer,Integer> addBiConsumer = (num1,num2) -> System.out.println("Addition "+ (num1+num2));
        BiConsumer<Integer,Integer> subBiConsumer = (num1,num2) -> System.out.println("Subtraction "+ (num1-num2));
        BiConsumer<Integer,Integer> mulBiConsumer = (num1,num2) -> System.out.println("Multiplication "+ (num1*num2));
        BiConsumer<Integer,Integer> devBiConsumer = (num1,num2) -> System.out.println("Division "+ (num1/num2));
        //biConsumer.accept("Chitranshu","Verma");
        //addBiConsumer.andThen(subBiConsumer).andThen(mulBiConsumer).andThen(devBiConsumer).accept(10,5);
        printNameAndActivities();
    }
}
