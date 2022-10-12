package com.qap2.exercise2;

public class CreditCard {

    private Money balance;
    private Money creditLimit;
    private Person owner;


    public CreditCard(Money limit, Person newCardHolder) {
        this.creditLimit = limit;
        this.owner = newCardHolder;
        this.balance = new Money(0);

    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public Person getPersonals() {
        return owner;
    }

    public void charge(Money amount){
        System.out.println("Attempt to charge " + amount);
        int balanceCheck = balance.add(amount).compareTo(getCreditLimit());

        if(balanceCheck == 1){
            System.out.println("Exceeds Credit Limit");
            System.out.println("Balance: " + getBalance());
            System.exit(0);
        }

     this.balance = getBalance().add(amount);
        System.out.println("Charge:" + amount);
    }

    public void payment(Money amount){
        System.out.println("Attempt to pay " + amount);
       this.balance= getBalance().subtract(amount);
        System.out.println("Payment " + amount);
    }
}
