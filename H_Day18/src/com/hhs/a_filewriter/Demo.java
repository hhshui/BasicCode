package com.hhs.a_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
        FileWriter fw = new FileWriter("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\copy1.txt");

        //字符流都带缓冲区,写数据是写道缓冲区 ->缓冲区刷新等待
        //而不带Buffered的流都是没有自动刷新的功能的 ->手动刷新 / 关流
        fw.write("你看我写的进去嘛!!!");

        fw.flush();

    }
}
