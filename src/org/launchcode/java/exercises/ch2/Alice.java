package org.launchcode.java.exercises.ch2;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";

        System.out.println("What 'word' would you like to search for in the first sentence of the 'Alice In Wonderland' book:");
        String searchTerm = input.nextLine();

        boolean answer = sentence.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println("\nThe first sentence of the book:\n" + sentence);
        System.out.println("\nWas the word '" + searchTerm + "' found in the first sentence of the 'Alice In Wonderland' book?(true or false): " + answer);

        if (answer) {
            String newSentence0;
            String newSentence1;
            int searchTermIndex = sentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            System.out.println("The index of the word '" + searchTerm + "' in the sentence is: " + searchTermIndex);
            System.out.println("The length of the word '" + searchTerm + "' is " + searchTerm.length() + " characters long.");
            newSentence1 = sentence.substring(searchTermIndex + searchTerm.length());

            if (searchTermIndex == 0) {
                System.out.println("The new sentence with the word '" + searchTerm + "' removed is:\n" + newSentence1);
            } else {
                newSentence0 = sentence.substring(0,searchTermIndex - 1);
                System.out.println("The new sentence with the word '" + searchTerm + "' removed is:\n" + newSentence0 + newSentence1);
            }
        }
    }

}
