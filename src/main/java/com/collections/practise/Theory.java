package com.collections.practise;

public class Theory {

    private static String collection = "Any group of individual objects which are represent as a single unit is know as collection.";

    private static String framework = "Set of classes and interfaces which provide a ready-made architecture";

    public static String defineCollection() {
        return collection;
    }

    public static String defineFramework() {
        return framework;
    }

    public static String collectionFramework() {

        return "Collection Framework is Java API, Which provides architecture to store and manipulate group of objects";

//        return collection + framework ;
//        return framework;



    }

    public static void main(String[] args) {


        System.out.println("Collection : "+defineCollection());

        System.out.println("Collection Framework : " +collectionFramework());

    }


}
