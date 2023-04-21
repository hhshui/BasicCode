package com.hhs.a_treeset;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student("张三",19));
        ts.add(new Student("李四",18));
        ts.add(new Student("王五",20));

        System.out.println("ts = " + ts);
        System.out.println("----------------------------");

        TreeSet<Integer> ts1 = new TreeSet<>();

        ts1.add(5);
        ts1.add(1);
        ts1.add(3);
        ts1.add(4);
        ts1.add(2);

        System.out.println("ts = " + ts1);

        System.out.println("----------------------------");

        TreeSet<String> ts2 = new TreeSet<>();

        ts2.add("a");
        ts2.add("2");
        ts2.add("0");
        ts2.add("A");
        ts2.add("1");
        ts2.add("10");
        ts2.add("中国");
        ts2.add("美国");
        ts2.add("俄罗斯");

        System.out.println("ts1 = " + ts2);
    }
}
