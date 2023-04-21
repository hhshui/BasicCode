package com.hhs.c_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Student>> school = new HashMap<>();

        ArrayList<Student> basic = new ArrayList<>();
        Collections.addAll(basic,new Student("张三",15),new Student("李四",19),new Student("王五",20));

        ArrayList<Student> job = new ArrayList<>();
        Collections.addAll(basic,new Student("小三",16),new Student("小四",18),new Student("小五",21));

        school.put("基础班",basic);
        school.put("就业班",job);

        Set<String> clazz = school.keySet();
        for (String clazzName : clazz) {
            ArrayList<Student> students = school.get(clazzName);
            for (Student student : students) {
                System.out.println("班级名称:"+clazz + "学生名称:"+student.getName()+"学生年龄:"+student.getAge());
            }
        }



    }
}
