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

    public Node append(int data) {
        newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return newNode;
    }

    public void insertInBetween(Node node, Node newNode) {
        Node temp = node.next;
        node.next = newNode;
        newNode.next = temp;

    }

    public Node pop() {
        Node tempNode = head;
        head = head.next;
        return tempNode;
    }

    public void popLast() {
        Node tempNode = head;
        while (tempNode.next != tail) {
            tempNode = tempNode.next;
        }
        tail = tempNode;
        tempNode.next = null;
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

    public void search(int value) {
        Node tempNode = head;
        int count = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    flag = true;
                    break;
                }
                count++;
                tempNode = tempNode.next;
            }
        }
        if (flag) {
            System.out.println("Element found at " + count + " position");
        } else {
            System.out.println("Element is not found");
        }

    }

    public int size() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void insertMiddle(int data) {
        Node newNode = new Node(data);
        int length = size();
        int mid = length % 2 != 0 ? (length + 1) / 2 : length / 2;
        Node prevNode = head;
        Node nextNode = head;
        for (int i = 0; i < mid; i++) {
            prevNode = nextNode;
            nextNode = nextNode.next;
        }
        prevNode.next = newNode;
        newNode.next = nextNode;
    }
    public void deleteNode(int key){
        Node current=head;
        Node tempNode=null;
        while (current != null && current.data != key ){
            tempNode=current;
            current=current.next;

        }
        if (current==null){
            return;
        }
        tempNode.next=current.next;
    }
}
