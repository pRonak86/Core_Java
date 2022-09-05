package com.Testing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapExample {
    public static void main(String[] args) {
//        HashMap h = new HashMap();
        LinkedHashMap h = new LinkedHashMap();
        h.put(1,"Java");
        h.put("Prog",10);
        h.put(2,40);
        h.put(12.2f,50);
        h.put(1,100);
        System.out.println(h);

    }
}
