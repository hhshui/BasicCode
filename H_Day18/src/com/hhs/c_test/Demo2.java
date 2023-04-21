package com.hhs.c_test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,new Student("sqgxy005","aaa",18,"aaa"),
                new Student("sqgxy006","bbb",11,"bbb"),
                new Student("sqgxy007","ccc",12,"ccc"),
                new Student("sqgxy008","ddd",13,"ddd"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\StudentInfo.txt",true));
        for (Student student : list) {
            int age = student.getAge();
            String name = student.getName();
            String adree = student.getAdree();
            String id = student.getId();
            StringBuilder sb = new StringBuilder();
            sb.append(id).append(",")
                    .append(name).append(",")
                    .append(age).append(",")
                    .append(adree);
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();
    }
}
