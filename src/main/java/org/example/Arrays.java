package org.example;

public class Arrays {

    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 6, 1, 6, 3};
        String[] words = {"jfk", "fdsgs", "agadsga"};
        int count = 0;
        System.out.println("Duplicate numbers:");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total Duplicates : " +count);

    }
}
