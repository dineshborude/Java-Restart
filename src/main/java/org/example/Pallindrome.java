package org.example;



import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word  :");

        String givenString = scan.next();

        System.out.println("String : " +givenString);
        String reverse = "";

        for (int i = givenString.length()-1; i >= 0; i--) {

            reverse = reverse + givenString.charAt(i);

        }

        System.out.println("Reversed : " +reverse);


        if(givenString.equals(reverse) ) {
            System.out.println("Pallindorme");
        }else {
            System.out.println("Not pallindrome");
        }

    }

}
