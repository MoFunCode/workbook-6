package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Mohamed", "Jami", 23));
        people.add(new Person("Shima", "Jami", 21));
        people.add(new Person("Sabrina", "Jami", 18));
        people.add(new Person("Haider", "Jami", 15));
        people.add(new Person("Ahmed", "Jami", 14));
        people.add(new Person("Amani", "Jami", 9));


        System.out.println("Original list of people:");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        System.out.print("Enter a name to search for (first or last): ");
        String searchName = scanner.nextLine().toLowerCase();

        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().toLowerCase().contains(searchName) ||
                    person.getLastName().toLowerCase().contains(searchName)) {
                matchingPeople.add(person);
            }
        }

        System.out.println("\nPeople with matching names:");
        if (matchingPeople.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person person : matchingPeople) {
                System.out.println(person);
            }
        }
        System.out.println();

        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        double averageAge = (double) totalAge / people.size();
        System.out.printf("Average age of all people: %.2f years\n", averageAge);

        Person oldestPerson = people.get(0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        System.out.println("Age of the oldest person: " + oldestPerson.getAge() + " years (" +
                oldestPerson.getFirstName() + " " + oldestPerson.getLastName() + ")");

        Person youngestPerson = people.get(0);
        for (Person person : people) {
            if (person.getAge() < youngestPerson.getAge()) {
                youngestPerson = person;
            }
        }
        System.out.println("Age of the youngest person: " + youngestPerson.getAge() + " years (" +
                youngestPerson.getFirstName() + " " + youngestPerson.getLastName() + ")");

        scanner.close();
    }
}