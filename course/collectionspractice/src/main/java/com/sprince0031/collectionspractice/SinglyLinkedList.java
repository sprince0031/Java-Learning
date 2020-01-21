package com.sprince0031.collectionspractice;

public class SinglyLinkedList<E> {
    private Node<E> currentNode = null;
    private Node<E> headNode = null;
    private Node<E> tailNode = null;
    private int currentIndex = 0;
    private int counter;
    public int length = 0;


    @Override
    public String toString() {
        counter = 0;
        String stringToReturn = "";
        if (headNode == null) {
            return stringToReturn;
        }
        stringToReturn += this.getNodeAtIndex(counter).getItem();
        while (this.getNodeAtIndex(counter).getNextNode() != null) {
            counter++;
            stringToReturn += " -> " + this.getNodeAtIndex(counter).getItem();
        }
        return stringToReturn;
    }

    public boolean add(E element) {
        if (headNode == null) {
            headNode = new Node<E>(element, null);
            currentNode = headNode;
            tailNode = headNode;
            length++;
        } else {
            tailNode.setNextNode(new Node<E>(element, null));
            if (headNode.getNextNode() == null) {
                headNode.setNextNode(tailNode);
            }
            tailNode = tailNode.getNextNode();
            length++;
        }
        return true;
    }

    public Node<E> getNodeAtIndex(int index) {
        if (currentIndex >= index) {
            currentNode = headNode;
            currentIndex = 0;
        } 
        for (; currentIndex < index; currentIndex++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }
    
    public boolean insert(E element, int index) {
        currentNode = getNodeAtIndex(index-1);
        Node<E> newNode = new Node<E>(element, currentNode.getNextNode());
        currentNode.setNextNode(newNode);
        length++;
        return true;
    }

    // TODO: delete method to delete node at specified index
    public Node<E> delete(int index) {
        Node<E> nodeBeforeNodeToDelete = getNodeAtIndex(index-1);
        Node<E> nodeToDelete = nodeBeforeNodeToDelete.getNextNode();
        nodeBeforeNodeToDelete.setNextNode(nodeToDelete.getNextNode());
        return nodeToDelete;
    }

    // TODO: Search by value

    // TODO: delete method to delete node containing first occurrance of the element.
    // public Node<E> delete(E element) {

    // }

}