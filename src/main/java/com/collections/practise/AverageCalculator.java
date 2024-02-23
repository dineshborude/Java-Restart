package com.collections.practise;

public class AverageCalculator {

    /*
    Write a function which calculates the average of the numbers in a given list.
     */

    public static void main(String[] args) {
        int [] numbers = {3,2,3,4};
        int size = numbers.length;
        int sum = 0;

        for(int i = 0; i < size; i++){

            sum = sum+numbers[i];

        }
        int average = sum/size;
        System.out.println(average);
    }



}
