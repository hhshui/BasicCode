package com.hhs.c_test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(""));

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //先读 存排序
        String line;
        while ((line = br.readLine()) != null){
            list.add(line);
        }
        //排序集合
        BufferedWriter bw = new BufferedWriter(new FileWriter(""));
        Collections.sort(list);
        //遍历集合 再写
        for (String shi : list) {
            bw.write(shi);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
