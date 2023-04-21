package com.hhs.标准代码;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 普通字符流一次一个字符复制字符文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        FileWriter fw = new FileWriter("目标文件地址");
        FileReader fr = new FileReader("源文件地址");

        int ch;
        //循环读写:一次一个字符
        while ((ch = fr.read())!= -1){
            fw.write(ch);
            fw.flush();
        }
        //关流
        fr.close();
        fw.close();
    }
}
