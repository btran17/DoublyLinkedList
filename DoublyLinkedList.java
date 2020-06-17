//package edu.belmont.csc.src;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    // TODO: declare the class variables
    Node head;
    Node tail;
    // END OF TODO

    // TODO: implement the internal Node class (hint: this should be very similar to SinglyLinkedList's Node class with
    //  an additional pointer)
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // END OF TODO

    // Empty the linked list; this should take O(n) time
    public void clear() {
        if(isEmpty())
            return;
        while(head != null){
            head.next = null;
            head = null;
            tail = null; //added
        }
    }

    // Check if the linked list if empty
    public boolean isEmpty() {
        if(head == null)
            return true;
        return false;
    }

    // Append a node to the tail of the linked list; this should have an O(1) implementation
    public void append(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
        }
        else{
            //assign value to null and reassign previous
            tail.next = newNode;
            newNode.prev = tail;
        }
        //assign tail to node and point next value to null
        tail = newNode;
        tail.next = null;
    }

    // Add a new node to the head of the linked list; this should have an O(1) implementation
    public void insertAtHead(int data) {
        Node newHead = new Node(data);
        if(isEmpty()) {
            head = newHead;
            tail = newHead; //added
            tail.next = null; //added
            head.prev = null;
        }
        else {
            head.prev = newHead;
            newHead.prev = null; //added
            newHead.next = head; //added
            head = head.prev; //added
        }
//        newHead.next = head;
//            head = newHead;

    }

    // Remove node from the head of this list and return the value of the removed node; should run in O(1) time
    public int removeFromHead() {
        if(isEmpty()) throw new NullPointerException();
        Node del = head;
        if(head != null) {
            head = head.next;
            del.prev = null;
        }
        return del.data;
    }

    // Remove node from the tail head of this list and return the removed node; should run in O(1) time
    public Node removeFromTail() {
        if(isEmpty()) throw new NullPointerException();
        if(tail.prev != null) {
            tail = tail.prev;
            tail.next = null;
        } else{
            removeFromHead();
        }
        return tail;
    }

    // Remove the specified node from the linked list and return the data of the removed node; should run in O(1) time
    private int remove(Node node) {
        if(node == null) throw new NoSuchElementException();
        if(node.prev != null){
            node.prev.next = node.next;
        }
        if(node.next != null){
            node.next.prev = node.prev;
        }
//        head = node.next;

        return node.data;
    }

    // Remove a node at a given index and return the removed node; this implementation should run in linear time
    public Node removeAt(int index) {
        if(isEmpty()) throw new NoSuchElementException();
        if (index == 0) {
            removeFromHead();
            return head;
        }
        if (index == indexOf(tail.data)) {
            removeFromTail();
            return tail;
        }

        if(index < 0)
            throw new IndexOutOfBoundsException();
        Node del = head;
        while(del != null){
            if(indexOf(del.data) == index){
                remove(del);
                return del;
            }
            del = del.next;
        }
        if(del == null)
            throw new IndexOutOfBoundsException();
        return null;
    }

    // Remove the first node with the specified value in the linked list; linear time complexity
    public boolean remove(int data) {
        if(isEmpty()) throw new NoSuchElementException();
        if (head.data == data) {
            removeFromHead();
            return true;
        }
        if (tail.data == data){
            removeFromTail();
            return true;
        }

        Node current = head;
        while(current != null){
            if(current.data == data){
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // Find the index of the first node in the linked list that has the specified value
    public int indexOf(int data) {
        if(isEmpty()) throw new IndexOutOfBoundsException();
        int result = -1;
        Node current = head;
        for(int i = 0; current != null; i++){
            if(current.data == data) {
                result = i;
                return result;
            }
            current = current.next;
        }
        if(result == -1)
            throw new IndexOutOfBoundsException();
        return result;
    }

    public void print() {
        Node current = head;
       if(isEmpty())
           System.out.print("Empty List \t");

//       System.out.print("null <-> ");
        while(current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public Node head(){
        return head;
    }
    public Node tail(){
        return tail;
    }
}
