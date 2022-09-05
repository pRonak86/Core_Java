package com.Testing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashTableExample {
    public static void main(String[] args) {

//        HashSet h = new HashSet();

        LinkedList h = new LinkedList();

        h.add(10);
        h.add(12.2f);
        h.add(10);
        h.add("hello");
        h.add(null);
        h.add("Testing");
        h.add("Java");
        h.add(null);

//        System.out.println(h);
        ListIterator l= h.listIterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }

    }
}
