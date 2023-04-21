package com.hhs.标准代码;

import java.io.*;

public class 高效字符流一次一个字符复制字符文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        BufferedWriter bw = new BufferedWriter(new FileWriter("目标文件地址"));
        BufferedReader br = new BufferedReader(new FileReader("源文件地址"));



        int ch;
        //循环读写:一次一个字符
        while ((ch = br.read())!= -1){
            bw.write(ch);
            bw.flush();
        }
        //关流
        br.close();
        bw.close();
    }
}
