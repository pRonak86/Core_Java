package com.Testing;

import java.util.Comparator;
import java.util.TreeSet;

class MyComprator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if(i1>i2)
        {
            return -1;
        }
        else if (i1<i2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

public class TreeSetWithComparator {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComprator());
        t.add(10);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(25);
        t.add(12);

        System.out.println(t);
    }
}
