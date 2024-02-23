package com.modernjava.java11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class SwitchExpressionExample1 {

    public static void main(String[] args) {
/*
New switch statements are not only more compact and readable.
They also remove the need for break statements.
The code execution will not fall through after the first match.
Another notable difference is that we can assign a switch statement directly to the variable.
It was not possible previously.
It’s also possible to execute code in switch expressions without returning any value
*/
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

        final DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        final String typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                "Working Day";
            case SATURDAY, SUNDAY ->
                "Day Off";
        };
        System.out.println("typeOfDay = " + typeOfDay);
    }

}
