package com.qap2.exercise2;

public class CreditCardDemo {

    public static void  main(String[]args){

        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT =  new Money(10.02);
        final Money THRID_Amount = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
        final Money TEST_AMOUNT = new Money(1200);

        int compare = LIMIT.compareTo(TEST_AMOUNT);
        System.out.println(compare);

        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie","WI","54751"));
        System.out.println(owner);
        Money money = new Money(1000.01);
        System.out.println(money);
    }
}
