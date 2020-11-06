package org.launchcode.java.exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};
        String someSent = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentArray = someSent.split("\\.");

        for (int num : someInts) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println(Arrays.toString(sentArray));
    }
}
