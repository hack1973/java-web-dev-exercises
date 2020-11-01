package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;

        System.out.println("To calculate the area of the circle enter a radius:");
        radius = input.nextDouble();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
    }
}
