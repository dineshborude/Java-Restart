package com.collections.practise;

public class CharCount {

    public static void main(String[] args) {

        String givenString = "India";
        givenString = givenString.toLowerCase();

        int strLength = givenString.length();

        for (int i = 0; i < strLength; i++) {

            char currentChar = givenString.charAt(i);

            if (currentChar == ' ') {
                continue;
            }

            int count = 0;

            for (int j = 0; j < strLength; j++) {

                if (currentChar == givenString.charAt(j)) {
                    count++;
                }

            }

            if (currentChar == ' ') {
                continue;
            }

            System.out.println("Character : " +givenString.charAt(i) + " count : " +count);

            givenString = givenString.replace(currentChar, ' ');

        }

    }
}
