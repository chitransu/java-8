package com.learn.java.defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> numberList);

    /**
     * size is the default method which can be overridden by implementation class
     * @param numberList
     * @return
     */
    default int size(List<Integer> numberList){
        System.out.println("Inside Multiplier interface");
        return numberList.size();
    }

    /**
     * isEmpty is the static method which can not be overridden by implementation class
     * @param numberList
     * @return
     */
    static boolean isEmpty(List<Integer> numberList){
        return numberList == null && numberList.size() == 0;
    }
}
