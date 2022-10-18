package com.qap2.exercise1;

public class MyCircle1  extends MyPoint{

    final double PI = Math.PI;

    private int radius;

    public MyCircle1() {
        super();
        this.radius = 1;
    }


    public MyCircle1(int radius) {
        this.radius = radius;
    }

    public MyCircle1(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return (PI * (Math.pow(radius, 2)));
    }

    @Override
    public double getCircumference(){
        return(2*PI * radius);
    }



    @Override

    public String toString(){
        return("Center " + super.toString() + " Radius :" + getRadius() );
    }



}
