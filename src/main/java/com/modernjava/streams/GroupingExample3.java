package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GroupingExample3 {

    public static void main(String[] args) {
        final Supplier<LinkedHashMap<Integer, List<String>>> mapFactory = LinkedHashMap::new;
        final Predicate<String> condicion = s -> s.contains("e");

        //grouping by length of string and also checking that the names contains e
        //and only return those name which has e in it
        final List<String> names = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        LinkedHashMap<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        LinkedHashMap::new,
                        Collectors.filtering(condicion, Collectors.toList())
                ));

        System.out.println("result = " + result);
        System.out.println("------------------");

        //instructor grouping them by Senior(>10) and Junior(<10) and filter them
        //on online courses
        final Function<Instructor, String> mapeo = instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR";
        LinkedHashMap<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(
                        mapeo,
                        LinkedHashMap::new,
                        Collectors.filtering(Instructor::isOnlineCourses, Collectors.toList())
                ));

        instructorByExpAndOnline.forEach((key, value) -> {
            System.out.println("key  = " + key + " value = " + value);
        });
    }

}
