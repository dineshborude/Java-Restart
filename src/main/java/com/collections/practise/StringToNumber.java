package com.collections.practise;

public class StringToNumber {

    /*
    We need a function that can transform a string into a number. What ways of achieving this do you know?

    Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
     */

    public static int stringToNumber(String str) {
        
        int num = Integer.parseInt(str);
        
        return num;
        
    }

    public static void main(String[] args) {
        int result = stringToNumber("6");
        System.out.println(result);
//        Class<?> elementType = result.getClass();
//        System.out.println(result.getClass());
    }
}
