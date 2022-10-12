package com.qap2.exercise2;

public class CreditCard {

    private Money balance;
    private Money creditLimit;
    private Person owner;


    public CreditCard(Money limit, Person newCardHolder) {
        this.creditLimit = limit;
        this.owner = newCardHolder;
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
        this.balance.add(amount);
    }

    public void payment(Money amount){
        this.balance.subtract(amount);
    }
}
