package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitAndSkipExample {

    public static Optional<Integer> limit(List<Integer> list) {
        //Although in stream we have passed 5 elements but as we have used limit(2)
        // so it will process first two elements only and return the addition of first two elements only
        // and other elements will be simply discarded.
        // so the result will be 6 + 7 = 13
        return list.stream().limit(2).reduce((x,y) -> x+y);
    }

    public static Optional<Integer> skip(List<Integer> list){
        //Although in stream we have passed 5 elements but as we have used skip(3)
        // so it will skip first three elements and process only last two elements only
        // so the result will be 9 + 10 = 19
        return list.stream().skip(3).reduce((x,y) -> x+y);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10);
        if(limit(list).isPresent()){
            System.out.println("The result of limit is "+ limit(list).get());
        }else{
            System.out.println("No input is passed");
        }

        if(skip(list).isPresent()){
            System.out.println("The result of skip is "+ skip(list).get());
        }else{
            System.out.println("No input is passed");
        }
    }
}
