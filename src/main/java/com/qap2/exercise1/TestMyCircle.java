// Author Mike Wadden
// Date October 11th, 2022
// QAP2 Exercise2 TestCircle

package com.qap2.exercise1;



public class TestMyCircle {

    public static void main(String[]args){

        MyPoint point1 = new MyPoint(10,10);
        MyPoint point2 = new MyPoint(5,5);

        System.out.println("Point 1 : " + point1);
        System.out.println("Point 2 : " + point2);


        MyCircle firstCircle = new MyCircle(point1, 5);
        MyCircle secondCircle = new MyCircle(point2, 6);
        System.out.println();

        System.out.println("First Circle : " + firstCircle);
        System.out.println("Second Circle : " + secondCircle);
        System.out.println();

        double areaFirstCircle = firstCircle.getArea();
        double areaSecondCircle = secondCircle.getArea();

        System.out.println("Area of First Circle : " + Math.round(areaFirstCircle));
        System.out.println("Area of Second Circle : " + Math.round(areaSecondCircle));
        System.out.println();

        double circumferenceFirstCircle = firstCircle.getCircumference();
        double circumferenceSecondCircle = secondCircle.getCircumference();
        System.out.println("Circumference of First Circle : " +  circumferenceFirstCircle);
        System.out.println("Circumference of Second Circle : " + circumferenceSecondCircle);
        System.out.println();

        System.out.println("The Distance between two circles is " + Math.round(firstCircle.distance(secondCircle)));
        System.out.println();

        System.out.println("Set Circle 1 Center To P2");

        firstCircle.setCenter(point2);
        System.out.println("First Circle : " + firstCircle);
        System.out.println("Second Circle : " + secondCircle);
        System.out.println("TheNew Distance between two circles is " + Math.round(firstCircle.distance(secondCircle)));
        System.out.println();

        point1.setXY(5,10);
        firstCircle.setCenter(new MyPoint(5,10));
        secondCircle.setCenterXY(25, 10);
        System.out.println("Set Circle 1 Center to (" + firstCircle.getCenterX() +  "," + firstCircle.getCenterY() + ") and Circle2 to " + point2);
        System.out.println("First Circle : " + firstCircle);
        System.out.println("Second Circle : " + secondCircle);
        System.out.println("Final distance between two circles is " + Math.round(firstCircle.distance(secondCircle)));



    }
}
