package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {

    public static void main(String[] args) {
        //partition instructors in two groups of instructor
        //first is years of experience is > 10 and other is <=10
        System.out.println("---------------Instructores con +10 anios de experiencia----------------");
        Predicate<Instructor> experiencePredicate = instructor
                -> instructor.getYearsOfExperience() > 10;
        Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate));
        partitionMap.forEach((key, value) -> {
            System.out.println("key = " + key + " value = " + value.stream().map(Instructor::getName).collect(Collectors.toList()));
        });

        //partition but return is set instead of list
        System.out.println("---------------Set de Instructores con +10 anios de experiencia----------------");
        Map<Boolean, Set<String>> partitionSet = Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate,
                        Collectors.mapping(s -> s.getName(), Collectors.toSet())
                ));
        partitionSet.forEach((key, value) -> {
            System.out.println("key = " + key + " value: " + value);
        });

        //partition by gender and return names as set
        System.out.println("---------------Instructores femeninos----------------");
        Map<Boolean, Set<String>> partitionGender = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(p -> p.getGender().equals("F"),
                        Collectors.mapping(s -> s.getName(), Collectors.toSet())
                ));
        partitionGender.forEach((key, value) -> {
            if (key) {
                System.out.println("key = " + key + " value: " + value);
            }
        });
    }

}
