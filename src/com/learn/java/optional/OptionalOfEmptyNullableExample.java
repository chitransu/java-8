package com.learn.java.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        // we should use Optional.ofNullable when we are not sure about object passing inside ofNullable
        // means it may be null or may not be null
        // so if the object is null , ofNullable will return Optional.empty()
        // and if object is not null , it will return the actual object
        // So in either case its safe and will not through NullPointerException
        Optional<String> stringOptional = Optional.ofNullable(null);
        //Optional<String> stringOptional = Optional.ofNullable("Hello");
        return stringOptional;
    }

    public static Optional<String> of(){
        // if we are 100% sure object passing inside Optional.of() is never going to be null
        // then only we should use it otherwise it will through null pointer exception
        Optional<String> stringOptional = Optional.of("Hello");
        //Optional<String> stringOptional = Optional.of(null);
        return stringOptional;
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
            System.out.println("OfNullable : "+ofNullable());
            System.out.println("Of : "+of());
            System.out.println("empty : "+empty());
    }
}
