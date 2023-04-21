package com.hhs.c_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(4);

        System.out.println("ts = " + ts);
    }
}
