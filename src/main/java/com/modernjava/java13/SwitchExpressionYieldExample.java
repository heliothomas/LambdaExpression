package com.modernjava.java13;

import java.time.LocalDate;
import java.time.Month;
import static java.time.Month.APRIL;
import static java.time.Month.AUGUST;
import static java.time.Month.DECEMBER;
import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;
import static java.time.Month.JULY;
import static java.time.Month.JUNE;
import static java.time.Month.MARCH;
import static java.time.Month.MAY;
import static java.time.Month.NOVEMBER;
import static java.time.Month.OCTOBER;
import static java.time.Month.SEPTEMBER;

public class SwitchExpressionYieldExample {

    public static void main(String[] args) {
        final Month mes = LocalDate.now().getMonth();

        final String quarter = switch (mes) {
            case JANUARY, FEBRUARY, MARCH -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear ? "FIRST QUARTER - LEAP YEAR" : "FIRST QUARTER");
            }
            case APRIL, MAY, JUNE ->
                "SECOND QUARTER";
            case JULY, AUGUST, SEPTEMBER ->
                "THIRD QUARTER";
            case OCTOBER, NOVEMBER, DECEMBER ->
                "FOURTH QUARTER";
            default ->
                "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);
    }

}
