package com.collections.practise;

public class SearchInArray {

    public static boolean checkInArray() {

        Object[] arr = {80, 117, 115, 104, 45, 85, 112, 115};

        int x = 85;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(x)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean found = checkInArray();
        System.out.println("Element found: " + found);
    }
}
