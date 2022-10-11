package com.qap2.exercise1;

public class TestMyCircle {

    public static void main(String[]args){

        MyPoint point1 = new MyPoint(10,10);
        MyPoint point2 = new MyPoint(5,5);

        System.out.println("Point 1 : " + point1);
        System.out.println("Point 2 : " + point2);

        MyCircle firstCircle = new MyCircle(point1, 5);
        MyCircle secondCircle = new MyCircle(point2, 6);

    }
}
