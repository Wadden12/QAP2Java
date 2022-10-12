package com.qap2.exercise2;

public class Person   {

    private String lastName;
    private String firstName;
    private Address home;



    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }



    @Override
    public String toString(){
        return("Name: " + firstName + " " + lastName + " " +  home);
    }
}
