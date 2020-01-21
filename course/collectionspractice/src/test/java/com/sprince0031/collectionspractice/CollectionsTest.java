package com.sprince0031.collectionspractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CollectionsTest {
    
    @Test
    public void shouldAddNewNodesInList() {
        SinglyLinkedList<Integer> sl1 = new SinglyLinkedList<Integer>();
        assertTrue(sl1.add(1));
        assertTrue(sl1.add(2));
        assertTrue(sl1.add(3));
        assertTrue(sl1.add(4));
    }

    @Test
    public void shouldReturnTheNodeAtSpecifiedIndex() {
        SinglyLinkedList<Integer> sl1 = new SinglyLinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            assertTrue(sl1.add(i));
        }
        assertEquals(new Integer(2), sl1.getNodeAtIndex(2).getItem());
        System.out.println(sl1.getNodeAtIndex(3).getItem());
        System.out.println(sl1.getNodeAtIndex(2).getItem());
    }

    @Test
    public void shouldInsertNewNodeAtGivenIndex() {
        SinglyLinkedList<Integer> sl1 = new SinglyLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            assertTrue(sl1.add(i+1));
        }
        System.out.println(sl1);
        assertTrue(sl1.insert(5, 3));
        System.out.println(sl1.getNodeAtIndex(3).getItem());
        System.out.println(sl1.getNodeAtIndex(2).getItem());
        System.out.println(sl1.getNodeAtIndex(4).getItem());
        System.out.println(sl1.getNodeAtIndex(5).getItem());
        System.out.println(sl1);
    }

    @Test
    public void shouldDeleteNodeSpecifiedbyIndexValue() {
        SinglyLinkedList<Integer> sl1 = new SinglyLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            assertTrue(sl1.add(i+1));
        }
        System.out.println("Before deletion index 3 has: " + sl1.getNodeAtIndex(3));
        System.out.println(sl1);
        System.out.println("Deleted node at index 3: " + sl1.delete(3));
        System.out.println("After deletion index 3 has: " + sl1.getNodeAtIndex(3));
        System.out.println(sl1);

    }

    @Test
    public void shouldPrintAllValuesInLinkedList() {
        SinglyLinkedList<Integer> sl1 = new SinglyLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            assertTrue(sl1.add(i+1));
        }
        System.out.println(sl1);
        System.out.println("length: " + sl1.length);
        for (int i = 0; i < sl1.length; i++) {
            System.out.println(sl1.getNodeAtIndex(i));
        }
    }
}
