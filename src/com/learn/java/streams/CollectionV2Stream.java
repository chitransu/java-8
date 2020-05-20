package com.learn.java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionV2Stream {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Ram");

        // External Iteration
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("--------------");

        // We can again iterate
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("-----Print names from stream---------");

        Stream<String> namesStream=names.stream();
        namesStream.forEach(System.out::println);
        System.out.println("-----Print names from stream wont work and it will through exception IllegalStateException : as  stream has already been operated upon or closed---------");
        System.out.println("-----Although it was not the case with Collection iteration---------");
        System.out.println("-----So we can traversed the stream only once although we can traversed the collection as may times as we want---------");
        //namesStream.forEach(System.out::println);
    }
}

// Collections : Can add or modify elements at any point of time . For Example : List -> list.add(<element>)
// Streams : Cannot add or modify elements in the stream. It is a fixed data set.
// Elements in the collection can be accessed in any order.Use appropriate methods based on the collection . For example : List -> list.get(4)
// Elements in the stream can be accessed only in sequence .
// Collection is eagerly constructed
// Streams are lazily constructed.
// Collections can be traversed "n" number of times
// Stream can be traversed only once
// Performs External Iteration to iterate through the elements
// Performs Internal Iteration to iterate through the elements .
