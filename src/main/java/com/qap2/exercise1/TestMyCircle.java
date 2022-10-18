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
        MyPoint thirdCircle = new MyCircle1(10, 10,5);
        MyPoint forthCircle = new MyCircle1(5, 5, 6);

        System.out.println();

        System.out.println("First Circle : " + firstCircle);
        System.out.println("Second Circle : " + secondCircle);
        System.out.println("Third and Fourth Circles are the same as First and Second but use Inheritance");
        System.out.println("Third Circle: " + thirdCircle);
        System.out.println("ForthCircle: " + forthCircle);
        System.out.println();

        double areaFirstCircle = firstCircle.getArea();
        double areaSecondCircle = secondCircle.getArea();
        double areaThirdCircle = thirdCircle.getArea();
        double areaForthCircle = forthCircle.getArea();

        System.out.println("Area of First Circle : " + Math.round(areaFirstCircle));
        System.out.println("Area of Second Circle : " + Math.round(areaSecondCircle));
        System.out.println("Area of Second Circle : " + Math.round(areaThirdCircle));
        System.out.println("Area of Second Circle : " + Math.round(areaForthCircle));
        System.out.println();

        double circumferenceFirstCircle = firstCircle.getCircumference();
        double circumferenceSecondCircle = secondCircle.getCircumference();
        double circumferenceThirdCircle = thirdCircle.getCircumference();
        double circumferenceForthCircle = forthCircle.getCircumference();
        System.out.println("Circumference of First Circle : " +  circumferenceFirstCircle);
        System.out.println("Circumference of Second Circle : " + circumferenceSecondCircle);
        System.out.println("Circumference of Third Circle : " + circumferenceThirdCircle);
        System.out.println("Circumference of Forth Circle : " + circumferenceForthCircle);
        System.out.println();

        System.out.println("The Distance between two circles is " + Math.round(firstCircle.distance(secondCircle)));
        System.out.println("The Distance between two circles is " + Math.round(thirdCircle.distance(forthCircle)));
        System.out.println();

        System.out.println("Set Circle 1 Center To P2");

        firstCircle.setCenter(point2);
        thirdCircle.setXY(forthCircle);
        System.out.println("First Circle : " + firstCircle);
        System.out.println("Second Circle : " + secondCircle);
        System.out.println("Third Circle : " + thirdCircle);
        System.out.println("Forth Circle : " + forthCircle);
        System.out.println("TheNew Distance between two circles is " + Math.round(firstCircle.distance(secondCircle)));
        System.out.println("TheNew Distance between two circles is " + Math.round(thirdCircle.distance(forthCircle)));
        System.out.println();

        point1.setXY(5,10);
        thirdCircle.setXY(5,10);
        firstCircle.setCenter(new MyPoint(5,10));
        secondCircle.setCenterXY(25, 10);
        forthCircle.setXY(25,10);
        System.out.println("Set Circle 1 Center to (" + firstCircle.getCenterX() +  "," + firstCircle.getCenterY() + ") and Circle2 to " + point2);
        System.out.println("Set Circle 3 Center to " +
                "(" + thirdCircle.getX() +  "," + thirdCircle.getY() + ") " +
                "and Circle4  Center to (" + forthCircle.getX() + "," + forthCircle.getY() + ")"  );
        System.out.println("First Circle : " + firstCircle);
        System.out.println("Second Circle : " + secondCircle);
        System.out.println("Third Circle :"  + thirdCircle);
        System.out.println("Forth Circle : " + forthCircle);
        System.out.println("Final distance between two circles is " + Math.round(firstCircle.distance(secondCircle)));
        System.out.println("Final distance between two cirlce is  "+ Math.round(thirdCircle.distance(forthCircle)));

    }


}
