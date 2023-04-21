package com.hhs.c_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java-workspaces\\BasicCode\\H_Day17\\src\\com\\hhs\\c_fileinputstream\\Demo.java");

        byte[] bys = new byte[1024];

        int len;
        while ((len = fis.read(bys)) != -1){
            String str = new String(bys,0,len);
            System.out.println(str);
        }


        fis.close();

    }
}
