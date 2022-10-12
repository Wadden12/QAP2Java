package com.qap2.exercise2;

public class CreditCardDemo {

    public static void  main(String[]args){

        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT =  new Money(10.02);
        final Money TEST_AMOUNT = new Money(0.98);
        final Money THRID_Amount = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie","WI","54751"));
        CreditCard visa = new CreditCard(LIMIT, owner);
        System.out.println(visa.getPersonals());
        printBalance(visa);
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();
        visa.charge(FIRST_AMOUNT);
        printBalance(visa);
        visa.charge(SECOND_AMOUNT);
        printBalance(visa);
        visa.charge(TEST_AMOUNT);
        printBalance(visa);
        visa.payment(THRID_Amount);
        printBalance(visa);
        visa.charge(FOURTH_AMOUNT);
        printBalance(visa);
    }

    private static  void printBalance(CreditCard money){
        System.out.println("Balance: " + money.getBalance());
    }

}
