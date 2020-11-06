package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> someNums = new ArrayList<>();
        String someSent = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //String[] someSent1 = someSent.split(" ");
        String[] sentArray = someSent.split(" ");


        System.out.println("What word length do you want to search for: ");
        int wordLength = input.nextInt();

        for (int i=0;i<10;i++) {
            someNums.add(i);
        }
        System.out.println(evenSum(someNums));
        fiveLetterWords(sentArray,wordLength);
        System.out.println(Arrays.toString(sentArray));

    }

    public static int evenSum(ArrayList<Integer> someNums) {
        int sum = 0;
        for (int num : someNums) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }
        return sum;
    }

    public static void fiveLetterWords(String[] sentArray,int wordLength) {
        for (String word : sentArray) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
