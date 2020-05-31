package com.learn.java.defaults.multipleinheritance;

public class Client123 implements  Interface1,Interface2,Interface3{
    public void methodA(){
        System.out.println("Inside method A "+Client123.class);
    }

    // Order of resolving the method call at run time
    // 1- class that implements the interface ie. Client123
    // 2- the sub interface that extends the interface ie. Interface2
    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA();  // at run time it will resolve to client implementation
        client123.methodB();
        client123.methodC();
    }
}
