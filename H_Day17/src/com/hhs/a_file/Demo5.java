package com.hhs.a_file;

import java.io.File;
import java.io.FileFilter;

public class Demo5 {
    public static void main(String[] args) {
        File file = new File("D:\\桌面\\学习资料");

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".zip") || pathname.isDirectory();
            }
        });
        for (File zifile : files) {
            System.out.println("zifile = " + zifile);
        }
    }
}
