package com.learn.java.defaults.multipleinheritance;

public interface Interface3 extends  Interface2{
    default void methodC(){
        System.out.println("Inside method C");
    }
}
