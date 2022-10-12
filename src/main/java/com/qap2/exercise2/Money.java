package com.qap2.exercise2;

public class Money {

    private long dollars;
    private long cents;

// Constructor
    public Money(double amount){

        if(amount <0){
            System.out.println("Input Error: Number can not be less than 0. Please Try Again!");
            System.exit(0);
        } else{
            long totalCents = Math.round(amount*100);
            this.cents = totalCents % 100;
            this.dollars = totalCents /100;
        }
    }

    public Money(Money value){
        this.dollars = value.dollars;
        this.cents = value.cents;
    }

    // Setters
    public void setDollars(long dollars) {
        this.dollars = dollars;
    }

    public void setCents(long cents) {
    // this is designed to check for the cents not going higher than 100 or less than 0 and if it does change the dollar value
        if(cents >=100){
            cents %= 100;
            setDollars(getDollars() + 1);
        }else if(cents<0){
            cents %=100;
            setDollars(getDollars() - 1);
        }
        this.cents = cents;
    }
    //Getters
    public long getDollars() {
        return dollars;
    }

    public long getCents() {
        return cents;
    }

    // Calculations

    public Money add(Money otherAmount){

        Money newMoney = new Money(this);
        long dollars = newMoney.dollars + otherAmount.dollars;
        long cents = newMoney.cents + otherAmount.cents;
        newMoney.setDollars(dollars);
        newMoney.setCents(cents);
        return newMoney;
    }

    public Money subtract(Money otherAmount){
        // add in validation for less than amount
        Money newMoney = new Money(this);
        long dollars = newMoney.dollars - otherAmount.dollars;
        long cents = newMoney.cents - otherAmount.cents;
        newMoney.setDollars(dollars);
        newMoney.setCents(cents);
        return newMoney;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return getDollars() == money.dollars && getCents() == money.cents;
    }


    public int compareTo(Money m){
        if (this == m) return 0;
        if (m == null || getClass() != m.getClass()) return -5;

        if((getDollars() == m.getDollars()) && (getCents() == m.getCents())){
            return 0;
        }else if( (getDollars() + getCents()) > (m.dollars + m.cents)){
            return 1;
        } else {
            return -1;
        }

    }
    @Override
    public String toString(){
        return (String.format("$%02d.%02d", getDollars(), getCents())) ;
    }

}
