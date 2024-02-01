package com.collections.practise;

public class Pangram {

    public static void main(String[] args) {
        String input = "The quick brown  jumps ove the lazy dog";

        checkPangram(input);
    }

    private static void checkPangram(String input) {
        // Convert the string to lowercase
        input = input.toLowerCase();

        // Assume it is a pangram initially
        boolean isPangram = true;

        // Iterate through each letter of the alphabet
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // Iterate through each character in the string
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                // If the current character is the current letter, break and check the next letter
                if (currentChar == ch) {
                    break;
                }

                // If we reach the end of the string and the letter is not found, print the message and set isPangram to false
                if (i == input.length() - 1) {
                    System.out.println("The given string is not a Pangram.");
                    isPangram = false;
                }
            }
        }

        // If isPangram is still true, print the message
        if (isPangram) {
            System.out.println("The given string is a Pangram!");
        }
    }
}
