package org.fasttrackit.code.classes;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    class Address{

        public static final String test =" TEST ";
        private final String street;
        private final String city;

        Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        public void showName(){
            System.out.println(Person.this.name);
        }
    }

    static class School{
        private final String name;

        School(String name) {
            this.name = name;
        }
    }
}
