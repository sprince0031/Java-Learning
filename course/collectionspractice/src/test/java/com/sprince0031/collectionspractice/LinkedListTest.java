package com.sprince0031.collectionspractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {
    
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
        for (int i = 0; i < 10; i++) {
            assertTrue(sl1.add(i+1));
        }
        System.out.println(sl1);
        assertEquals(new Integer(2), sl1.getNodeAtIndex(1).getItem());
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
        System.out.println("Deleted node at index 3: " + sl1.deleteValueAtIndex(3));
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

    @Test
    public void shouldReturnNodeContainingSearchTerm() {
        SinglyLinkedList<String> sl2 = new SinglyLinkedList<>();
        assertTrue(sl2.add("Hello"));
        assertTrue(sl2.add("World!"));
        assertTrue(sl2.add("Sprince0031"));
        assertTrue(sl2.add("here."));
        System.out.println(sl2);
        assertTrue(sl2.insert("Whatcha doin?", 4));
        System.out.println(sl2);
        assertEquals("Sprince0031", sl2.deleteValueAtIndex(2).getItem());
        System.out.println(sl2);
        assertTrue(sl2.insert("Priju", 2));
        System.out.println(sl2);
        assertEquals("Priju", sl2.find("Priju").getItem());
        assertEquals("-1", sl2.find("hjas").getItem());
        SinglyLinkedList<Integer> sl3 = new SinglyLinkedList<>();
        assertTrue(sl3.add(1));
        assertTrue(sl3.add(65));
        assertTrue(sl3.add(234));
        assertTrue(sl3.add(123213));
        System.out.println(sl3);
        assertEquals((int)234, (int)sl3.find(234).getItem());
        assertEquals("-1", sl3.find(87126378).getItem());
    }

    @Test
    public void shouldDeleteNodeContainingFirstOccuranceOfValue() {
        SinglyLinkedList<String> sl2 = new SinglyLinkedList<>();
        assertTrue(sl2.add("Hello"));
        assertTrue(sl2.add("World!"));
        assertTrue(sl2.add("Sprince0031"));
        assertTrue(sl2.add("here."));
        System.out.println(sl2);
        assertTrue(sl2.insert("Whatcha doin?", 4));
        System.out.println(sl2);
        assertEquals("Sprince0031", sl2.deleteValueAtIndex(2).getItem());
        System.out.println(sl2);
        assertTrue(sl2.insert("Priju", 2));
        System.out.println(sl2);
        assertEquals("Priju", sl2.deleteFirstOccurance("Priju").getItem());
        assertEquals("-1", sl2.deleteFirstOccurance("Prij").getItem());
        System.out.println(sl2);
    }
}
