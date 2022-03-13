package com.blz_datastructures;

public class Operations {
    public LinkedList addNodeInStart() {
        LinkedList list = new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();
        return list;
    }

    public LinkedList addNodeATEnd() {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.display();
        return list;
    }

    public LinkedList insertInBetween() {
        LinkedList list = new LinkedList();
        Node first = list.append(56);
        Node second = list.append(70);
        Node newnode = new Node(30);
        System.out.println("Before insertion");
        list.display();
        System.out.println();
        list.insertInBetween(first, newnode);
        System.out.println("After insertion");
        list.display();
        return list;


    }

    public LinkedList deleteFromStart() {
        LinkedList list = addNodeInStart();
        System.out.println();
        list.pop();
        list.display();
        return list;
    }

    public LinkedList deleteFromEnd() {
        LinkedList list = addNodeInStart();
        System.out.println();
        list.popLast();
        list.display();
        return list;
    }

    public void searchElement() {
        LinkedList list = addNodeInStart();
        System.out.println();
        list.search(30);
    }

    public void insertInMiddle() {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        System.out.println("Before inserting the data");
        list.display();
        list.insertMiddle(40);
        System.out.println("After inserting the data");
        list.display();
    }

    public LinkedList deleteElement() {
        LinkedList list=new LinkedList();
        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);
        list.display();

        System.out.println("After deleting the key");
        list.deleteNode(40);

        list.size();
        list.display();



        


        return list;
    }
}
