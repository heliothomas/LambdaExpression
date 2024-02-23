package com.modernjava.defaults;

public class MultipleIneritanceExample implements InterfaceA, InterfaceB, InterfaceC {

    public static void main(String[] args) {
        MultipleIneritanceExample multiInheritance = new MultipleIneritanceExample();
        multiInheritance.sumA(4, 8);  // resolve to child
        multiInheritance.sumB(2, 4);
        multiInheritance.sumC(1, 2);
    }

    // implemented class first
    // the sub interface that extends the interface
    @Override
    public void sumA(int num1, int num2) {
        System.out.println("MultipleIneritanceExample.sumA" + (num1 + num2));
    }

}
