package com.hhs.g_throws;

public class Demo {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        System.out.println("开始");
        //运行时异常 : 数学异常
        System.out.println(7 / 0);
        System.out.println("结束");
    }
}
