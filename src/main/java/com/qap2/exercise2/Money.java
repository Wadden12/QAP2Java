package com.qap2.exercise2;

public class Money {

    private long dollars;
    private long cents;


    public Money(double amount){

        String[] number = String.valueOf(amount).split("\\.");
        this.dollars = Long.parseLong(number[0]);
        System.out.println(dollars);
        String centlist = number[1];
        if(centlist.length() ==1){
            this.cents = (Long.parseLong(number[1])) * 10;
        }else{
            this.cents = Long.parseLong(number[1]);
        }
    }

    public Money(Money value){
        this.dollars = value.dollars;
        this.cents = value.cents;
    }

    public static Money add(Money otherAmount){

        return new Money(otherAmount);

    }

}
