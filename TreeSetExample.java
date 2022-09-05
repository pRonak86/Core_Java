package com.Testing;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

//          System.out.println("A".compareTo("D")); // A comes Before D // Negative
//            // A is 65 & D is 68 --> 65-68 -> -3
//
//          System.out.println("D".compareTo("A")); // D Comes After A // Positive
//
//          System.out.println("A".compareTo("A")); // Both element are same --> Zero
        TreeSet t = new TreeSet();
        t.add(20);
        t.add(5);
//        t.add(30);
//        t.add(5);
//        t.add(15);
        System.out.println(t);
    }
}
