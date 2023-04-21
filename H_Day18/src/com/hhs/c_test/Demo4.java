package com.hhs.c_test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo4 {
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
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] split1 = o1.split("\\.");
                String[] split2 = o2.split("\\.");
                String s1 = split1[0];
                String s2 = split1[0];
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                return i1 - i2;
            }
        });
        //遍历集合 再写
        for (String shi : list) {
            bw.write(shi);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
