package com.collections.practise;

public class RemoveFirstAndLastChar {

    /*

    It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
    You're given one parameter, the original string. You don't have to worry about strings with less than two characters.

     */

    public static String removeFirstAndLast() {
        String name = "danny";
        return name.substring(1,name.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(removeFirstAndLast());
    }
}
