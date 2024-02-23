package com.collections.practise;

import java.util.Arrays;

public class ReversedSequenceArray {

    /*
    Build a function that returns an array of integers from n to 1 where n > 0.
    Example: n = 5 --> [5, 4, 3, 2, 1]
     */

    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] result = reverse(6);

            System.out.print(Arrays.toString(result));

    }

}
