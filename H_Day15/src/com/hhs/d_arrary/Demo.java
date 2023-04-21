package com.hhs.d_arrary;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        //基本数据类型数组
        int[] arr = {5,1,3,6,2};

        Arrays.sort(arr);//快速排序

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("----------------------------------------------");
        //要降序
        //static <T> void sort(T[] a, Comparator<T> c)
        Integer[] arr1 ={5,1,3,6,2};
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        System.out.println("-----------------------------------------------");
        String[] arr2 = {"0","2","10","1"};
        //a. static void sort(Object[] a)  -> 元素自带排序规则
        Arrays.sort(arr2);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

        //static <T> void sort(T[] a, Comparator<T> c)
        Arrays.sort(arr2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2) ;
            }
        });
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        System.out.println("--------------------------------------------------");

        int c =1;
        //无效赋值
        c =c++;
        System.out.println("c = " + c);

    }
}
