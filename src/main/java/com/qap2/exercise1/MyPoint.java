package com.qap2.exercise1;

public class  MyPoint {
    private int x = 0;
    private int y = 0;

    // Constructors

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        setX(x);
        setY(y);
    }


    //Setters
    public void setXY(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setXY(MyPoint point){
        this.x = point.x;
        this.y = point.y;
    }


    public void setX(int x) {
        this.x = x;
    }



    public void setY(int y) {
        this.y = y;
    }

    // Getters

    public int getX() {
        return x;
    }

    public double getArea(){
        return 0;
    }

    public double getCircumference(){
        return 0;
    }

    public int getY() {
        return y;
    }

    // Calculations
    public double distance(int x, int y)
    {

        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(MyPoint otherPoint)
    {

        int xDiff = this.x - otherPoint.x;
        int yDiff = this.y - otherPoint.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

    }
    public double distance()
    {
        int xDiff = this.x;
        int yDiff = this.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }


    @Override
    public String toString() {
        return ("Coordinates are ("+this.x + "," + this.y+")");
    }
}
