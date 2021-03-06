package com.sprince0031.collectionspractice;

public class Node<E> {
    private final E item;
    private Node<E> next = null;
    private Node<E> previous = null;

    @Override
    public String toString() {
        if (next != null) {
            return "value: " + item + ", next node: " + next.item;
        } else {
            return "value: " + item + ", END OF LIST";
        }
    }

    public Node(String nullHandler) {
        item = (E) nullHandler;
    }

    // For singly-linked list
    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }
    
    // For doubly-linked list
    public Node(E item, Node<E> next, Node<E> previous) {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }

    public E getItem() {
        return item;
    }

    public Node<E> getNextNode() {
        return next;
    }

    public void setNextNode(Node<E> nextNode) {
        next = nextNode;
    }
     
    public Node<E> getPreviousNode() {
        return previous;
    }
}