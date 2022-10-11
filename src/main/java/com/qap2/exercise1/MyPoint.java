package com.qap2.exercise1;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setXY(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

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
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }


    @Override
    public String toString() {
        return ("Center's ("+this.x + "," + this.y+")");
    }
}
