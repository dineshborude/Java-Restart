package com.collections.practise;

public class FindNeedleInTrash {

    public static void main(String[] args) {

        Object[] arr = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        int size = arr.length;

        for(int i = 0; i < size; i++) {

            if(arr[i] != null && arr[i].equals("needle")) {

                System.out.println("Found Needle at " +i);

            }


            else {
                System.out.println("NOT FOUND");
            }

        }





    }


}
