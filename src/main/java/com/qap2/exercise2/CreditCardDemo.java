package com.qap2.exercise2;

public class CreditCardDemo {

    public static void  main(String[]args){

        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie","WI","54751"));
        System.out.println(owner);
        Money money = new Money(1000);
    }
}
