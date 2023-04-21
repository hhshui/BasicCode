package com.hhs.basic.basicprogramming;

public class Question8 {
    public static void main(String[] args) {
        String str =getFileName("http://localhost:8080/testweb/index.html");
        System.out.println("str = " + str);
    }
    public static String getFileName(String url){
        return url.substring(url.lastIndexOf('.')+1);
    }
}
