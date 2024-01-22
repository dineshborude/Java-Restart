package org.example;

public class ReverseString {

    public static void main(String[] args) {

        String given = "India is my Country";

        String reverse = "";

        for (int i = given.length()-1; i >= 0; i--) {

            reverse = reverse + given.charAt(i);

        }
        System.out.println(reverse);
    }

}
