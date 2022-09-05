package com.Testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList a = new ArrayList(); // Be default Size = 10
//        LinkedList a = new LinkedList();
        a.add(10); // Object of Integer

        a.add(12.2f); // object of Float
        a.add("Hello"); // Object of String
        a.add(true); // Object of Boolean
        a.add(123213l); // Object of Long
        a.add(10);
        a.add(null);

        Iterator i = a.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }



//        System.out.println(a);
//        for(Object obj : a)
//        {
//            System.out.println("Value of object --"+obj);
//        }
//
//        a.add(1,"Java");
//
//        System.out.println("After  Update"+a);
//
//        a.remove(1);
//
//        System.out.println("After Remove-"+a);

    }
}
