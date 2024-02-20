package com.collections.practise;

public class SmallestElementArray {

    public static void main(String[] args) {

        int[] arr = {20,45,30,5,8};
        int small = arr[0];
        int size = arr.length;

        for(int i = 0; i < size; i++) {

            if(small > arr[i]) {
                small = arr[i];
            }

        }
        System.out.println(small);
    }



}
