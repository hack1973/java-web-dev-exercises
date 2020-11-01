package org.launchcode.java.exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven:");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed:");
        Double gallons = input.nextDouble();

        double mpg = miles / gallons;
        System.out.println("You have got " + mpg + " miles to the gallon.");
    }
}
