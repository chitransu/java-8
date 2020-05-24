package com.learn.java.optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        // isPresent
        Optional<String> optional = Optional.ofNullable("Hello Optional");
        //System.out.println(optional.isPresent());
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        // ifPresent : it does two things first it checks if optional has value
        // if optional has value then it accept consumer which we can use to perform some operations
        // like in this case it does only print the value
        optional.ifPresent(System.out::println);
    }
}
