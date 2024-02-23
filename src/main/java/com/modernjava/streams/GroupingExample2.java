package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupingExample2 {

    public static void main(String[] args) {
        //grouping by length of string and also checking that the names contains e
        //and only return those name which has e in it
        final List<String> names = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        final Predicate<String> condicion = s -> s.contains("e");

        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.filtering(condicion, Collectors.toList())
                ));

        System.out.println("result = " + result);
        System.out.println("------------------");

        //instructor grouping them by Senior(>10) and Junior(<10) and filter them
        //on online courses
        final Function<Instructor, String> mapeo = instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR";

        Map<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(mapeo,
                        Collectors.filtering(s -> s.isOnlineCourses(), Collectors.toList())
                ));

        instructorByExpAndOnline.forEach((key, value) -> {
            System.out.println("key  = " + key + " value = " + value);
        });
    }

}
