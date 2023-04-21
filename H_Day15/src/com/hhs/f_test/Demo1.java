package com.hhs.f_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        //创建一副牌
        //new 一个数组集合存放所有的牌
        ArrayList<String> maps = new ArrayList<>();
        String[] flowers = {"♥","♠","♦","♣"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //双重for循环将牌数和对应的花色存放到集合中
        for (String flower : flowers) {
            for (String number : numbers) {
                maps.add(flower+number);
            }
        }

        //添加大小王
        maps.add("joker");
        maps.add("JOKER");

        //打印
        System.out.println("maps = " + maps);
        //计算牌的总数
        System.out.println("maps.size() = " + maps.size());
        //洗牌
        Collections.shuffle(maps);
        //打印
        System.out.println("maps = " + maps);

        //发牌
        ArrayList<String> 底牌 = new ArrayList<>();
        ArrayList<String> 张三 = new ArrayList<>();
        ArrayList<String> 李四 = new ArrayList<>();
        ArrayList<String> 王五 = new ArrayList<>();

        底牌.add(maps.get(maps.size()-1));
        底牌.add(maps.get(maps.size()-2));
        底牌.add(maps.get(maps.size()-3));

        for (int i = 0; i < maps.size() - 3; i++) {
            if (i % 3 ==0){
                张三.add(maps.get(i));
            } else if (i % 3 ==1) {
                李四.add(maps.get(i));
            } else {
                王五.add(maps.get(i));
            }
        }

        //偷梁换柱
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"3","4","5","6","7","8","9","1","J","Q","K","A","2","o","O");

        Comparator<String> ruler = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(1);
                char c2 = o2.charAt(1);
                int i1 = list.indexOf(String.valueOf(c1));
                int i2 = list.indexOf(String.valueOf(c2));
                return i1 - i2;
            }
        };
        Collections.sort(张三,ruler);
        Collections.sort(李四,ruler);
        Collections.sort(王五,ruler);
        Collections.sort(底牌,ruler);


        System.out.println("地主牌 = " + 底牌);
        System.out.println("张三 = " + 张三);
        System.out.println("李四 = " + 李四);
        System.out.println("王五 = " + 王五);

    }
}
