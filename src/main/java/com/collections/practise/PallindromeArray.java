package com.collections.practise;

class PallindromeArray {

        static boolean checkPallindrome(int[] numsArray) {


            int length = numsArray.length;
            int[] reversed = new int[length];

            for (int i = 0; i < length; i++) {

                reversed[i] = numsArray[length-i-1];

            }

            for (int i = 0; i < length; i++) {
                if (numsArray[i] != reversed[i]) {
                    return false;
                }
            }

            return true;
        }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 1};
        if (checkPallindrome(nums1)) {
            System.out.println("Array 1 is a palindrome.");
        } else {
            System.out.println("Array 1 is not a palindrome.");
        }
    }
}
