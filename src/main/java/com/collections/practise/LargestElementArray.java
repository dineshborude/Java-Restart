package com.collections.practise;

public class LargestElementArray {

    public static void main(String[] args) {

        int[] arr = {11,19,11,9,15,8};

        int size = arr.length;
        int max = arr[0];



            for(int j = 0; j < size; j++)
            {

                if(max < arr[j])
                {
                    max = arr[j];

                }

            }

        System.out.println(max);

    }


}
