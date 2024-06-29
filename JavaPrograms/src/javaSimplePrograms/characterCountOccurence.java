package javaSimplePrograms;

import java.util.HashMap;

public class characterCountOccurence {
    public static void main(String[] args) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Sample string
        String str = "hello";

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCountMap.put(ch, 1);
            }
        }

        // Iterate over the map and print each key-value pair
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " Count: " + entry.getValue());
        }
    }
} 
