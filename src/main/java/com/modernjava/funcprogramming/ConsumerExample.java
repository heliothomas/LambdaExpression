package com.modernjava.funcprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.length() + " the value of x: " + x);
        c.accept("Helio Mora");

        //Consumer with block statement
        Consumer<Integer> d = (x) -> {
            System.out.println("x*x = " + (x * x));
            System.out.println("x+x = " + (x + x));
        };
        Integer veinte = 20;

        Consumer<Integer> e = (x) -> {
            System.out.println("x*20 = " + (x * veinte));
            System.out.println("x+20 = " + (x + veinte));
        };
        d.andThen(e).accept(10);
    }

}
