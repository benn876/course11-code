package org.fasttrackit.code.classes;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("name");
        Person.Address address = person.new Address("Piata Unirii", "Oradea");

        Person.School school = new Person.School("Liceul de arta");
        System.out.println(Person.Address.test);

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };
    }
}
