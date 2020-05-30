package com.learn.java.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{
    @Override
    public int multiply(List<Integer> numberList) {
        return numberList.stream().reduce(1,(x,y) -> x*y);
    }

    @Override
    public int size(List<Integer> numberList){
        System.out.println("Inside Multiplier Impl");
        return numberList.size();
    }
}
