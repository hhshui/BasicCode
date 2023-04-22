package com.hhs.标准代码;

import java.io.*;

public class 默写_高效字符流一次一行复制字符文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        BufferedWriter bw = new BufferedWriter(new FileWriter("目标文件"));
        BufferedReader br = new BufferedReader(new FileReader("源文件"));
        //循环读写
        //定义String变量line用来存储每次读到的一行字符串
        String line;
        while((line = br.readLine()) != null){
            //读一行写一行
            bw.write(line);
            //写换行符
            //bw.write("\r\n");
            bw.newLine();
            //刷新 -> 不需要 因为带Buffered
            //bw.flush();
        }

        //关流
        bw.close();
        br.close();
    }
}
