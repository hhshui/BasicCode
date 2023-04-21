package com.hhs.a_file;

import java.io.File;
import java.io.IOException;

/*
    File类的构造方法
    创建fill对象做了哪些事
        1.创建对象
        2.开辟内存空间
        3.使File对象指向路径结尾的文件或文件夹
        4.文件文件夹不存在,也不会创建文件或文件夹
        5.文件文件夹存在,也不会覆盖源文件


        如果创建的的文件/文件夹存在,creatNewFile不会覆盖

* */
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建一个file对象
        File file = new File("D:\\java-workspaces\\BasicCode\\H_Day17\\test");

        System.out.println("file = " + file);

        //分父子路径的形式创建File对象
        File file1 = new File("D:\\java-workspaces\\BasicCode\\H_Day17\\test", "abc.txt");

        //父路径是File
        File parent = new File("D:\\java-workspaces\\BasicCode\\H_Day17\\test");
        //只创建文件夹
        parent.mkdirs();
        File file2 = new File(parent, "abc.txt");
        //只创建文件
        file2.createNewFile();
    }
}
