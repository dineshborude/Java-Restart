package com.collections.practise;

public class ReverseString {

  static String name = "Danny";
   static String reverse = "";

    public static void main(String[] args) {

        for (int i = name.length(); i > 0; i--) {

            reverse = reverse + name.charAt(i);

        }

    }

}
