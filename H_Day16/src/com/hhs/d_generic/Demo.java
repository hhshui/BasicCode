package com.hhs.d_generic;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        //1.不明确泛型,泛型默认是Object
        Student student = new Student();
        student.setAge(18);//Object类型参数

        //2.明确泛型
        Student<String> student1 = new Student<>();
        student1.setAge("19");//String

        Student<Integer> student2 = new Student<>();
        student2.setAge(20);

    }
}
