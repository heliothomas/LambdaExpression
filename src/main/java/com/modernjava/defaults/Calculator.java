package com.modernjava.defaults;

//@FunctionalInterface works with 1 abstract method
public interface Calculator {

    //abstract sum method
    public int sum(int num1, int num2);

    //abstract division method
//    public int divide(int num1, int num2);

//    //default method which is subtract
    default int subtract(int num1, int num2) {
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

}
