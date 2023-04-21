package com.hhs.a_file;

import java.io.File;
import java.io.FileFilter;

public class Demo6 {

    public static String table="";

    public static void main(String[] args) {
        File file = new File("D:\\桌面\\学习资料");
        getFile(file,"");
    }

    public static void getFile(File root,String table){
        if (root.isFile()){
            System.out.println(table + "文件: " + root.getName());
            return;
        }
        System.out.println(table + "文件夹: "+root.getName());

        table += "\t";

        File[] files = root.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".java") || pathname.isDirectory();
            }
        });
        for (File zifile : files) {
            getFile(zifile,table);

        }

    }
}
