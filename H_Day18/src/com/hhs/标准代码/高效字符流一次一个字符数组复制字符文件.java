package com.hhs.标准代码;

import java.io.*;

public class 高效字符流一次一个字符数组复制字符文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        BufferedWriter bw = new BufferedWriter(new FileWriter("目标文件地址"));
        BufferedReader br = new BufferedReader(new FileReader("源文件地址"));

        //循环读写:一次一个字符数组
        //创建一个字符数组存储每次读到的字符
        char[] chars = new char[1024];

        //创建一个统计变量 统计每次读到的字符个数
        int len;
        while ((len = br.read(chars)) != -1){
            //都多少写多少
            bw.write(chars,0,len);
            //刷新
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
