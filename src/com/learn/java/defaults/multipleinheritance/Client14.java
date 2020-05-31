package com.learn.java.defaults.multipleinheritance;

// Here Client14 implements two interface - Interface1 and Interface4 and both the interface have the
// same method signature method methodA() , now Client14 will be confused while resolving the method call
// and it will show error so to avoid its confusion we have to override methodA() in class Client14
// and this is the only way to resolve such conflict
public class Client14 implements Interface1,Interface4{
    @Override
    public void methodA() {
        System.out.println("Inside method A "+Client14.class);
    }

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();
    }
}
