package com.hhs.c_comparator;

import com.hhs.a_treeset.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        students.add(new Student("张三",19));
        students.add(new Student("李四",16));
        students.add(new Student("王五",20));

        System.out.println("students = " + students);
    }
}
