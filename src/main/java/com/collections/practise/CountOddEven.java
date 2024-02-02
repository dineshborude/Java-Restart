package com.collections.practise;

public class CountOddEven {

   static void countOddEven() {

        int oddCount = 0;
        int evenCount = 0;

        int[] nums = {1,2,5,6,1,4,6};

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }

       System.out.println(oddCount);
       System.out.println(evenCount);

    }




    public static void main(String[] args) {
        countOddEven();
    }


}
