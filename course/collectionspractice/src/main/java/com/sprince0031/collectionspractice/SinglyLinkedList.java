package com.sprince0031.collectionspractice;

public class SinglyLinkedList<E> {
    private Node<E> currentNode = null;
    private Node<E> headNode = null;
    private Node<E> tailNode = null;
    private int currentIndex = 0;
    private int tailIndex = 0;

    public boolean add(E element) {
        if (headNode == null) {
            headNode = new Node<E>(element, null);
            currentNode = headNode;
            tailNode = headNode;
        } else {
            tailNode.setNextNode(new Node<E>(element, null));
            if (headNode.getNextNode() == null) {
                headNode.setNextNode(tailNode);
            }
            tailNode = tailNode.getNextNode();
            tailIndex++;
        }
        return true;
    }

    public Node<E> getNodeAtIndex(int index) {
        if (currentIndex >= index) {
            currentNode = headNode;
            currentIndex = 0;
        } 
        for (; currentIndex < index-1; currentIndex++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }
    
    public boolean insert(E element, int index) {
        currentNode = getNodeAtIndex(index-1);
        Node<E> newNode = new Node<E>(element, currentNode.getNextNode());
        currentNode.setNextNode(newNode);
        return true;
    }

   

    }

}