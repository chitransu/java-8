package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxNumber(List<Integer> list){
        // x=0 , y=5 -> x = result
        // x=5 , y=6  -> x = result
        // x=6 , y=7  -> x = result
        // x=7 , y=8  -> x = result
        // x=8 , y=9  -> x = result
        // x=9 , y=10  -> x = result
        // result = 10 will be returned
        return list.stream().reduce(0, (x,y) -> x > y ? x : y);
        // do not use this approach of reduce to calculate the min value
        // otherwise it will always return the 0 as min value
    }

    public static Optional<Integer> findMaxNumberUsingOptional(List<Integer> list){
        return list.stream().reduce((x,y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMinValueUsingOptional(List<Integer> list){
        return list.stream().reduce((x,y) -> x < y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,7,8,9,10);
        System.out.println("Max Number "+findMaxNumber(list));
        if(findMaxNumberUsingOptional(list).isPresent()){
            System.out.println("Max Number using optional "+findMaxNumberUsingOptional(list).get());
        }else{
            System.out.println("List is empty");
        }

        if(findMinValueUsingOptional(list).isPresent()){
            System.out.println("Min Number using optional "+findMinValueUsingOptional(list).get());
        }else{
            System.out.println("List is empty");
        }
    }
}
