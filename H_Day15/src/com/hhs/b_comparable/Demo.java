package com.hhs.b_comparable;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();

        //创建对象给集合
        //添加元素
        people.add(new Person("Amy",19,100,100,100));
        people.add(new Person("Jerry",22,90,70,80));
        people.add(new Person("Tony",24,100,60,80));
        people.add(new Person("Lucy",25,90,80,70));
        people.add(new Person("Tom",16,100,100,100));
        people.add(new Person("Bob",16,100,100,100));
        people.add(new Person("Lily",27,60,25,50));

        for (Person person : people) {
            System.out.println(person);
        }
    }

}
