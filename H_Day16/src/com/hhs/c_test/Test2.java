package com.hhs.c_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {

        HashMap<String, HashMap<Student, String>> school = new HashMap<>();

        HashMap<Student, String> basic = new HashMap<>();
        basic.put(new Student("张三",13),"男");
        basic.put(new Student("李四",12),"女");
        basic.put(new Student("王五",14),"男");

        HashMap<Student, String> job = new HashMap<>();
        job.put(new Student("小三",13),"男");
        job.put(new Student("小四",12),"女");
        job.put(new Student("小五",14),"男");

        school.put("基础班",basic);
        school.put("就业班",job);

        Set<Map.Entry<String, HashMap<Student, String>>> entries = school.entrySet();
        for (Map.Entry<String, HashMap<Student, String>> entry : entries) {
            String clazzName = entry.getKey();
            HashMap<Student, String> clazz = entry.getValue();
            Set<Student> students = clazz.keySet();
            for (Student student : students) {
                String gender = clazz.get(student);
                System.out.println("班级名称: "+clazzName + " 学生名称: "+student.getName()+" 学生年龄: "+student.getAge()+" 学生性别: "+gender);
            }

        }
    }
}
