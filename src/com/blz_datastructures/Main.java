package com.blz_datastructures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations operations = new Operations();
        System.out.println("Enter 1 to Add data from start");
        System.out.println("Enter 2 to Add data from End");
        System.out.println("Enter 3 to Insert data in Between two values");
        System.out.println("Enter 4 to Delete data from Start");
        System.out.println("Enter 5 to Delete data from End");
        System.out.println("Enter 6 to Search an element");
        System.out.println("Enter 7 to Insert the data in list");
        System.out.println("Enter 8 to Delete the specific key");
        switch (sc.nextInt()) {
            case 1:
                operations.addNodeInStart();
                break;
            case 2:
                operations.addNodeATEnd();
                break;
            case 3:
                operations.insertInBetween();
                break;
            case 4:
                operations.deleteFromStart();
                break;
            case 5:
                operations.deleteFromEnd();
                break;
            case 6:
                operations.searchElement();
                break;
            case 7:
                operations.insertInMiddle();
                break;
            case 8:
                operations.deleteElement();
                break;

        }
    }

}

