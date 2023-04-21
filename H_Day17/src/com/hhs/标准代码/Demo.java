package com.hhs.标准代码;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建流
        FileOutputStream fos = new FileOutputStream("D:\\java-workspaces\\BasicCode\\H_Day17\\test\\ceshi.txt");
        FileInputStream fis = new FileInputStream("D:\\java-workspaces\\BasicCode\\H_Day17\\test\\copy1.txt");
        //循环读写
        int ch;
        while ((ch = fis.read()) != -1){
            fos.write(ch);
        }

        //关闭流
        fos.close();
        fis.close();

    }
}
