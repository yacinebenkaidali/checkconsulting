package org.checkconsulting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var min = 10;
        var max = 30;
        var numberOfPeople = 100;
        // Using Person class which uses lombok
        List<Person> people = new ArrayList<>(numberOfPeople);
        Comparator<Person> compare = Comparator
                .comparing(Person::getAge)
                .thenComparing(Person::getFirstName);

        Random rand = new Random();

        for (int i = 1; i <= numberOfPeople; i++) {
            int randomNum = rand.nextInt((max - min) + 1) + min;
            var person = new Person(String.format("yacine %d", i), String.format("bka %d", i), randomNum);
            people.add(person);
        }
        var sortedPeople = people.stream().sorted(compare).collect(Collectors.toList());

        System.out.println(sortedPeople);
        System.out.println("---------------------------------------------------");


        Comparator<Person2> compare2 = Comparator
                .comparing(Person2::getAge)
                .thenComparing(Person2::getFirstName);
        List<Person2> people2 = new ArrayList<>(numberOfPeople);
        for (int i = 1; i <= numberOfPeople; i++) {
            int randomNum = rand.nextInt((max - min) + 1) + min;
            var person = new Person2(String.format("yacine %d", i), String.format("bka %d", i), randomNum);
            people2.add(person);
        }
        var sortedPeople2 = people2.stream().sorted(compare2).collect(Collectors.toList());

        System.out.println(sortedPeople2);
        System.out.println("---------------------------------------------------");
    }
}