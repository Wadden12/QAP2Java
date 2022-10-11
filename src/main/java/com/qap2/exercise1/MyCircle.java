package com.qap2.exercise1;

public class MyCircle {

    // Declarations
    private MyPoint center = new MyPoint();
    private int radius = 1;

    // Constant
    final double PI = 3.14;


    // Constructors

    public MyCircle(){};

    public MyCircle(int x, int y, int radius){
        this.radius = radius;
        center = new MyPoint(x,y);
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

     // Getters

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public int getCenterX(){
        return center.getX();
    }

    public int getCenterY(){
        return center.getY();
    }

    // Setters
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public void setCenterXY(int x, int y){
        center.setXY(x, y);
    }

    // Calculations methods

    public double getArea(){

        return (PI*(Math.pow(radius,radius)));
    }

    public double getCircumference(){
        return(2*PI*radius);
    }

    public double distance(MyCircle circle){
    return center.distance(circle.getCenter());
    }


    @Override
    public String toString() {
        return ("Centre" + center + " Radius : " + getRadius());
    }



}
