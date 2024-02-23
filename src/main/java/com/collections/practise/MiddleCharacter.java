package com.collections.practise;

public class MiddleCharacter {

    /*

    You are going to be given a word. Your job is to return the middle character of the word.
    If the word's length is odd, return the middle character.
    If the word's length is even, return the middle 2 characters.

     */



    public static String middleChar(String str) {

        int size = str.length();
        int middleChar = size / 2;

        if (size % 2 == 0) {
            // For even length strings, return the middle 2 characters
            return str.substring(middleChar - 1, middleChar + 1);
        } else {
            // For odd length strings, return the middle character
            return str.substring(middleChar, middleChar + 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(middleChar("test"));
    }
}
