package com.hhs.b_treemap;

import com.hhs.c_test.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();
        tm.put(new Student("张三",19),"男");
        tm.put(new Student("李四",20),"女");
        tm.put(new Student("王五",17),"男");

        System.out.println("tm = " + tm);
        System.out.println("------------------------------");

        TreeMap<Student, String> tm1 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        tm1.put(new Student("张三",19),"男");
        tm1.put(new Student("李四",20),"女");
        tm1.put(new Student("王五",17),"男");

        System.out.println("tm1 = " + tm1);


    }
}
