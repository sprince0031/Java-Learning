package com.sprince0031.collectionspractice;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
// import 

public class ArrayListPractice {
    private static final int INITIAL_CAPACITY = 15;

    public static void main(String[] args) {
        // ArrayList data structure of generic collection type
        System.out.println("Using generic Collection methods:");
        Collection<String> myElements = new ArrayList<>(INITIAL_CAPACITY);
        myElements.add("A");
        myElements.add("B");
        myElements.add("A");
        myElements.add("C");
        myElements.add("S");
        myElements.add("P");

        for(String s: myElements) {
            System.out.print(s + " ");
        }

        System.out.println("\n"+myElements); // Directly printing out the elements make use of the toString() method.
        
        myElements.remove("A");
        System.out.println(myElements);
        System.out.println("Size of list: " + myElements.size());
        System.out.println("Is the list empty? " + myElements.isEmpty());
        myElements.removeAll(myElements);
        System.out.println("Now is the list empty? " + myElements.isEmpty());

        // ArrayList data structure using List interface methods.
        System.out.println("\nUsing List interface methods:");
        List<String> listElements = new ArrayList<>(INITIAL_CAPACITY);
        listElements.add("A");
        listElements.add("B");
        listElements.add("A");
        listElements.add("C");
        System.out.println("Added elements normally: " + listElements);
        listElements.add(0, "S"); // List interface type overrides the add method to provie functionality to add elements using index position.
        listElements.add(1, "P");
        System.out.println("Added elements at speific index locations" + listElements);
        
        listElements.remove(4); // remove() can now remove elements based on their specified index position.
        System.out.println("Removed element at a specific index position: " + listElements);
        System.out.println("Size of the list: " + listElements.size());
        listElements.add("A");
        System.out.println("Added another \'A\' - " + listElements);
        System.out.println("First index of \'A\' is : " + listElements.indexOf("A"));
        System.out.println("Last index of \'A\' is : " + listElements.lastIndexOf("A"));
    }
}
