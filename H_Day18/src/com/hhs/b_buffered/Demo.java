package com.hhs.b_buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //高效字符输入流一次一行读字符文件
        BufferedReader br = new BufferedReader(new FileReader("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\copy1.txt"));
        String n;
        while ((n = br.readLine()) != null) {
            System.out.println("n = " + n);
        }
        //text();
    }

    private static void text() throws IOException {
        //高效字符输入流一次一行读字符文件
        BufferedReader br = new BufferedReader(new FileReader("D:\\java-workspaces\\BasicCode\\H_Day18\\test\\copy1.txt"));
        //一次读一行
        String line = br.readLine();
        System.out.println("readLine = " + line);

        line = br.readLine();
        System.out.println("readLine = " + line);

        line = br.readLine();
        System.out.println("readLine = " + line);

        line = br.readLine();
        System.out.println("readLine = " + line);

        System.out.println("readLine = " + line);
        System.out.println("readLine = " + line);
        System.out.println("readLine = " + line);
        System.out.println("readLine = " + line);

        br.close();
    }
}
