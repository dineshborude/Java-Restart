package org.example;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");

        int num = scan.nextInt();

        int count = 0;

        while (num>0) {
            num = num/10;
            count++;
        }

        System.out.println(count);

    }

}
