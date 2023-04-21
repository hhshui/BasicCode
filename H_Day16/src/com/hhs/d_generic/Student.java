package com.hhs.d_generic;

public class Student<P> {

    private String name;

    private P age;

    public Student() {
    }

    public Student(String name, P age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public P getAge() {
        return age;
    }

    public void setAge(P age) {
        this.age = age;
    }
}
