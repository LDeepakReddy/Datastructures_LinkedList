package com.blz_datastructures;

public class LinkedList {
    Node newNode;
    public Node head;
    public Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void push(int data) {
        newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void append(int data) {
        newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list");
        while (current != null) {
            if (current.next != null) {
                System.out.print(current.data + "==> ");
            } else {
                System.out.println(current.data);
            }
            current = current.next;
        }
        System.out.println();
    }
}
