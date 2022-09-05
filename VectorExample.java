package com.Testing;

import javax.sound.midi.Soundbank;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();
//        System.out.println("Initial Capacity-"+v.capacity());
        v.addElement(10);
        v.addElement(12.2f);
        v.addElement("Hello");
        v.addElement(null);
        v.addElement(10);
        v.addElement(14.2f);
        v.addElement(15.2f);
        v.addElement(16.2f);
        v.addElement(20);
        v.addElement(50);
        System.out.println(v);
        System.out.println("Access");

        Enumeration e = v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }



//        System.out.println("After Add 10 Element --"+v.capacity());
//        v.add(2,"Java");
//        System.out.println("After Add 1 element on index 2  --"+v.capacity());
//
//        v.remove(3);
//        v.remove(5);
//        v.remove(6);
//        System.out.println("After remove index 3 --"+v.capacity());

    }
}
