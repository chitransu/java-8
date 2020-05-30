package com.learn.java.defaults;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {
    static Consumer<Student> studentConsumer = student -> System.out.println(student);
   // static Comparator<Student> nameComparator = (s1,s2) -> s1.getName().compareTo(s2.getName());
      static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    //static Comparator<Student> gpaComparator =  (s1,s2) -> Double.compare(s1.getGpa(),s2.getGpa());
     static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    //static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa).reversed();
    static Comparator<Student> nameAndGpaComparator = nameComparator.thenComparing(gpaComparator);

    public static void sortByName(List<Student> studentList){
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList){
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByNameAndGpa(List<Student> studentList){
        studentList.sort(nameAndGpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullFirst(List<Student> studentList){
        // If the list contains null values , we need to sort such list
        // we can use nullFirst(),nullLast() methods to compare such list
        //Comparator<Student> nullLastComparator = Comparator.nullsLast(nameComparator);
        Comparator<Student> nullFirstComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(nullFirstComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("-------- Before Sorting ---------");
        studentList.forEach(studentConsumer);
        System.out.println("-------- After Sorting ---------");
        //sortByName(studentList);
       // sortByGpa(studentList);
       // sortByNameAndGpa(studentList);
        sortWithNullFirst(studentList);
    }
}
