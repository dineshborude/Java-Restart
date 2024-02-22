package com.collections.practise;

public class SumArrays {
    /*
    Write a function that takes an array of numbers and returns the sum of the numbers.
    The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
     */

    public static int addArrayElements() {

        int[] arr = {1, 5, 4, 0, -1};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addArrayElements());
    }
}
