package com.hhs.d_generic;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        show(100);
        show("Hello");
        show(new Student());
    }

    //泛型方法
    public static <T> void show(T t){
        //T类型就可以在方法内使用
        if (t instanceof String){
            String s = (String)t;
            System.out.println("s.length() = " + s.length());
        }
    }
}
