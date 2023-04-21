package com.hhs.c_test;

import java.util.Objects;

public class Student {
    String id;
    String name;
    int age;
    String adree;

    public Student() {
    }

    public Student(String id, String name, int age, String adree) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adree = adree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdree() {
        return adree;
    }

    public void setAdree(String adree) {
        this.adree = adree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(adree, student.adree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, adree);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adree='" + adree + '\'' +
                '}';
    }
}
