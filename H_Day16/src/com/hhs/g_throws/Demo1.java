package com.hhs.g_throws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        show();
    }



    public static void show() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //编译时期异常 : 解析异常
        Date date = sdf.parse("1991年01-01 00:00:00");
        System.out.println("date = " + date);
    }
}
