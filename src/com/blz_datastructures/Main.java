package com.blz_datastructures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations operations = new Operations();
        System.out.println("Enter 1 to Add data from start");
        System.out.println("Enter 2 to Add data from End");
        switch (sc.nextInt()) {
            case 1:
                operations.addNodeInStart();
                break;
            case 2:
                operations.addNodeATEnd();
                break;

        }
    }

}

