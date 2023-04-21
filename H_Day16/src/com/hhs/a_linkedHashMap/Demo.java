package com.hhs.a_linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("张三",19);
        hm.put("李四",17);
        hm.put("王五",20);

        Set<String> keys = hm.keySet();
        for (String key : keys) {
            Integer age = hm.get(key);
            System.out.println("姓名 = " + key +" 年龄:" + age);
        }

        System.out.println("----------------------------------------");
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("张三",19);
        lhm.put("李四",17);
        lhm.put("王五",20);

        Set<Map.Entry<String, Integer>> entries = lhm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println("姓名:"+name + " 年龄: "+age);
        }
    }
}
