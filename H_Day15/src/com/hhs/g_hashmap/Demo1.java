package com.hhs.g_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //创建双链表集合对象
        HashMap<String, String> hm = new HashMap<>();
        hm.put("奶亮","露露");
        hm.put("暴强","荣荣");
        hm.put("宇帆","白河");
        //收集所有有的结婚证
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //遍历结婚证集合
        for (Map.Entry<String, String> entry : entries) {
            //从结婚证中获取丈夫和妻子
            String key = entry.getKey();
            String value = entry.getValue();
            //打印
            System.out.println(key+"------"+value);

        }
    }
}
