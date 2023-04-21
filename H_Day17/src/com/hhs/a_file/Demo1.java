package com.hhs.a_file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //指向桌面上的abc.txt
        File file = new File("D:\\桌面\\abc.txt");

        //反例:调错方法
        //file.mkdirs();
        file.createNewFile();
        System.out.println("------------------------------------");

        File parent = new File("D:\\桌面\\aaa\\bbb");

        //先创建父路径所有文件夹路径
        parent.mkdirs();
        File file1 = new File(parent, "Hello.java");
        file1.createNewFile();

        //File的四个静态常量
        System.out.println("File.pathSeparator = " + File.pathSeparator);
        System.out.println("File.separator = " + File.separator);

    }
}
