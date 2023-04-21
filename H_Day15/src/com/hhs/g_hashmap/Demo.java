package com.hhs.g_hashmap;

import java.util.HashMap;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        //创建双链表集合对象
        HashMap<String, String> hm = new HashMap<>();
        hm.put("奶亮","露露");
        hm.put("暴强","荣荣");
        hm.put("宇帆","白河");
        //召集所有的丈夫
        Set<String> keys = hm.keySet();
        //增强for遍历所有的丈夫
        for (String key : keys) {
            //通过丈夫找到妻子
            String value = hm.get(key);
            System.out.println(key+"------"+value);

        }
    }
}
