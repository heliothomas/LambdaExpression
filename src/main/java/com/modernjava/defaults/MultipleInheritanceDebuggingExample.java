package com.modernjava.defaults;

public class MultipleInheritanceDebuggingExample implements InterfaceA, InterfaceD {

    @Override
    public void sumA(int num1, int num2) {
        System.out.println("MultipleInheritanceDebuggingExample.sumA" + (num1 + num2));
    }

}
