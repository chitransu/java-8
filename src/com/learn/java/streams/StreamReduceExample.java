package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public  static Integer performMultiplication(List<Integer> numbers){
        return numbers
                .stream()
                .reduce(1,(x,y) -> x*y);
        // 1 is the initial value , so reduce perform the operations in below sequence
        // input stream value = 1 , initial value = 1 result = 1 * 1 = 1 (now result will become the value of x)
        // input stream value = 3 , x value = 1 result = 1 * 3 = 3 (now result will become the value of x)
        // input stream value = 5 , x value = 3 result = 3 * 5 = 15 (now result will become the value of x)
        // input stream value = 7 , x value = 15 result = 15 * 7 = 105 (now result will become the value of x)
        // and the final value will be returned
    }

    // Optional is a class introduced in java8 to handle null values in more elegant way , it has methods like isPresent() , get()
    public  static Optional<Integer> performMultiplicationWithoutInitialValue(List<Integer> numbers){
        return numbers
                .stream()
                .reduce((x,y) -> x*y);
    }

    public static Optional<Student> getHeighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream().reduce((s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(numbers));
        Optional<Integer> result = performMultiplicationWithoutInitialValue(numbers);
        System.out.println("result from performMultiplicationWithoutInitialValue "+result.isPresent());
        System.out.println("result from performMultiplicationWithoutInitialValue "+result.get());

        List<Integer>  numbers2 = Arrays.asList();
        Optional<Integer> result2 = performMultiplicationWithoutInitialValue(numbers2);

        if(result2.isPresent()){
            System.out.println("result from performMultiplicationWithoutInitialValue "+result2.get());
        }

        if(getHeighestGpaStudent().isPresent()){
            System.out.println(getHeighestGpaStudent().get());
        }
    }
}
