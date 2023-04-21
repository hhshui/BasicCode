package com.hhs.标准代码;

import java.io.*;

public class 默写_高效字符流一次一行复制字符文件 {
    public static void main(String[] args) throws IOException {
        //创建流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\copy2.txt"));
        BufferedReader br = new BufferedReader(new FileReader("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\copy1.txt"));

        //循环读写
        //定义String变量line用来存储每次读到的一行字符串
        String line;
        while ((line = br.readLine()) != null){
            //读一行写一行
            bw.write(line);
            bw.newLine();
        }

        //关流
        bw.close();
        br.close();
    }
}
