package com.modernjava.lambda;

public class HelloWorldLambda {

    public static void main(String[] args) {
        //implementing sayHelloWorld Using Lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello World with Lambda";

        System.out.println(helloWorldInterface.sayHelloWorld());
    }

}
