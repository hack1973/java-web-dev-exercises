package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInParagraph = paragraph.toCharArray();
        HashMap<Character,Integer> characterCount = new HashMap<>();

        for (char character : charactersInParagraph) {

            if (characterCount.containsKey(character)) {
                Integer count = characterCount.get(character);
                characterCount.put(character,count+1);
            } else {
                characterCount.put(character,1);
            }
        }

        for (Map.Entry<Character,Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }




    }
}
