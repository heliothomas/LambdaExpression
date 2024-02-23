package com.modernjava.java9;

import java.util.*;

public class FactoryMethodsExample {

    public static void main(String[] args) {
        //How we used to create unmodifiable list pre Java 9
        List<String> names = new ArrayList();
        names.add("Syed");
        names.add("Mike");
        names.add("Jenny");
        names = Collections.unmodifiableList(names);
        System.out.println("names = " + names);
//        names.sort(Comparator.naturalOrder());//unmodifiableList cannot be sorted

        //Factory methods of Java 9
        //Returns an unmodifiable list, set containing three elements.
        System.out.println("---------------Java 9------------");
        List<String> listaJ9 = List.of("Syed", "Mike", "Jenny", "Thomas");
        System.out.println("names2 = " + listaJ9);
        Set<String> set = Set.of("Syed", "Mike", "Jenny", "Thomas");
        System.out.println("set = " + set);
        Map<String, String> map = Map.of("Grade1", "Syed", "Grade2", "Mike", "Grade3", "Tommy", "Grade4", "Gema");
        System.out.println("map = " + map);

        //These collections cannot be modifiable with List.of, Set.of, Map.of
//        listaJ9.add("Gene");
//        set = Set.of("Syed", "Syed", "Mike");
//        map.put("Grade5", "Lenini");
    }

}
