package com.hhs.标准代码;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 默写_文件字节流一次一个字节数组复制文件 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java-workspaces\\BasicCode\\H_Day17\\test\\copy1.txt");
        FileOutputStream fos = new FileOutputStream("D:\\java-workspaces\\BasicCode\\H_Day17\\test\\ceshi.txt");

        byte[] bys = new byte[1024];

        int len;

        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();
    }
}
