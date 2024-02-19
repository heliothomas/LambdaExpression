package com.modernjava.funcprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(2, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println("maxBi.apply(70, 8) : " + maxBi.apply(70, 8));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("minBy.apply(70, 15) : " + minBy.apply(70, 15));

        IntBinaryOperator intBi = (a, b) -> a * b;
        System.out.println(intBi.applyAsInt(2, 4));

        LongBinaryOperator longBi = (a, b) -> a * b;
        System.out.println(longBi.applyAsLong(10_000, 2_100_230));

        DoubleBinaryOperator doubleBi = (a, b) -> a * b;
        System.out.println(doubleBi.applyAsDouble(10.50, 220.50));
    }

}
