package com.hhs.标准代码;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 普通字符流一次一个字符数组复制字符文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        FileWriter fw = new FileWriter("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\copy1.txt");
        FileReader fr = new FileReader("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\copy2.txt");

        //循环读写:一次一个字符数组
        //创建一个字符数组存储每次读到的字符
        char[] chars = new char[1024];

        //创建一个统计变量 统计每次读到的字符个数
        int len;
        while ((len = fr.read(chars)) != -1){
            //都多少写多少
            fw.write(chars,0,len);
            //刷新
            fw.flush();
        }
        fw.close();
        fr.close();
    }
}
