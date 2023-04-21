package com.hhs.basic.basicprogramming;

public class Question7 {
    public static void main(String[] args) {
        String str = "hello1231231";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = tmp;
        }
        System.out.println("new String(chars) = " + new String(chars));
        //System.out.println("chars.toString() = " + chars.toString());
    }
}
