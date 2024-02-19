package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        final List<Instructor> instructors = Instructors.getAll();

        Consumer<Instructor> c2 = (s1) -> System.out.print("\n" + s1.getName());//", " + 

        //Loop through all the instructors and print out their names and their courses
        Consumer<Instructor> c3 = (s1) -> System.out.print(s1.getCourses() + ", ");
        instructors.forEach(c2.andThen(c3));

        //Loop through all the instructors and print out their name if the years of experience is >10
        System.out.println("\n\n------instructors > 10 years----");
        instructors.forEach(s1 -> {
            if (s1.yearsOfExperience > 10) {
                c2.accept(s1);
            }
        });

        //Loop through all the instructors and print out their name and years of experience if years
        //of experience is >5 and teaches course online
        System.out.println("\n\n------instructors > 5 years and teaches online----");
        instructors.forEach(s1 -> {
            if (s1.yearsOfExperience > 5 && s1.isOnlineCourses()) {
                c2.andThen(c3).accept(s1);
            }
        });
    }

}
