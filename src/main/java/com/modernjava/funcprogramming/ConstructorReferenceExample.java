package com.modernjava.funcprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Thomas", 10, "Software Developer",
                 "M", true, Arrays.asList("Java Programming", "Oracle PL SQL", "Oracle Service Bus"));

        System.out.println(instructor);
    }

}
