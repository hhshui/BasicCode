package com.hhs.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question29 {
    public static void main(String[] args) {
        Integer[] datas = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(datas);//aslist 返回一个受指定数组支持的固定大小的数组列表
        list.add(5);
        System.out.println(list.size());
    }


}
