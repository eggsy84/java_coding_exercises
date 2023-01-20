package com.techreturners.exercise002;

public class Person{
    private String firstname;
    private String lastname;
    private String city;
    private int age;

    public Person(String firstname, String lastname, String city, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.age = age;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getCity() {
        return this.city;
    }

    public int getAge() {
        return this.age;
    }


}

