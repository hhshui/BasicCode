package com.hhs.c_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\StudentInfo.txt"));

        //创建结合对象
        ArrayList<Student> students = new ArrayList<>();
        //一次读一行数据
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            Student student = new Student(split[0], split[1],Integer.parseInt( split[2]), split[3]);
            students.add(student);
        }
        br.close();
        for (Student student : students) {
            System.out.println("student = " + student);
        }
    }
}
