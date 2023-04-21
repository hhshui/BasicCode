package com.hhs.a_file;

import java.io.File;
import java.io.IOException;

/*
        IO流体系下 相对路径起点是当前项目的根目录
* */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //练相对路径表达
        File file = new File("abc.txt"); //当前项目的根目录\\abc.txt
        file.createNewFile();

        File file1 = new File("H_Day17\\src\\abc.txt");
        file1.createNewFile();

        File file2 = new File("H_Day17\\src\\com\\hhs\\a_file\\abc.txt");
        file2.createNewFile();
    }
}
