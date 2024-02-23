package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingExample1 {

    public static void main(String[] args) {
        //group list of name by their length
        List<String> names = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("result = " + result);

        System.out.println("-----------------");
        //grouping by instructors by their gender
        Map<String, List<Instructor>> instructorByGender = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::getGender));

        instructorByGender.forEach((key, value) -> {
            System.out.println("key = " + key + " value = " + value);
        });

        System.out.println("-----------------");
        //grouping by experience where >10 years of experience is classified
        //as Senior and others are junior
        Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(instructor -> instructor
                .getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"));

        instructorsByExperience.forEach((key, value) -> {
            System.out.println("key = " + key + " value = " + value.stream().map(Instructor::getName).collect(Collectors.toList()));
        });

        Stream<String> estrim = Stream.of("Helio", "Thomas", "Mora", "Flores");
        Map<Integer, List<String>> mapeo = estrim.collect(Collectors.groupingBy(String::length));

        System.out.println("-----------------");
        mapeo.entrySet().forEach(System.out::print);
    }

}
