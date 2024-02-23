package com.modernjava.java11;

public class SwitchStatementExample {

    public static void main(String[] args) {
        //Traditional example in Java 8
        final String month = "JANUARY";
        final String quarter;

        switch (month) {
            case "JANUARY":
                quarter = "FIRST QUARTER";
                break;
            case "FEBRUARY":
                quarter = "FIRST QUARTER";
                break;
            case "MARCH":
                quarter = "FIRST QUARTER";
                break;
            case "APRIL":
                quarter = "SECOND QUARTER";
                break;
            case "MAY":
                quarter = "SECOND QUARTER";
                break;
            case "JUNE":
                quarter = "SECOND QUARTER";
                break;
            case "JULY":
                quarter = "THIRD QUARTER";
                break;
            case "AUGUST":
                quarter = "THIRD QUARTER";
                break;
            case "SEPTEMBER":
                quarter = "THIRD QUARTER";
                break;
            case "OCTOBER":
                quarter = "FORTH QUARTER";
                break;
            case "NOVEMBER":
                quarter = "FOURTH QUARTER";
                break;
            case "DECEMBER":
                quarter = "FOURTH QUARTER";
                break;
            default:
                quarter = "UNKNOWN QUARTER";
                break;
        }
        System.out.println("quarter = " + quarter);
    }

}
