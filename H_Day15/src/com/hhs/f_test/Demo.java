package com.hhs.f_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {

        //创建牌
        ArrayList<String> maps = new ArrayList<>();

        String[] flowers ={"♠","♣","♦","♥"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String flower : flowers) {
            for (String number : numbers) {
                maps.add(flower+number);
            }
        }
        maps.add("joker");
        maps.add("JOKER");
        System.out.println("maps = " + maps);

        //洗牌
        Collections.shuffle(maps);

        //System.out.println("maps.size() = " + maps.size());
        System.out.println("maps = " + maps);

        //发牌
        ArrayList<String> 地主牌 = new ArrayList<>();
        ArrayList<String> 张三 = new ArrayList<>();
        ArrayList<String> 李四 = new ArrayList<>();
        ArrayList<String> 王五 = new ArrayList<>();

        地主牌.add(maps.get(maps.size() - 1));
        地主牌.add(maps.get(maps.size() - 2));
        地主牌.add(maps.get(maps.size() - 3));

        //等分为三份
        for (int i = 0; i < maps.size() - 4; i++) {
            if (i % 3 == 0){
                张三.add(maps.get(i));
            }else if (i % 3 == 1){
                李四.add(maps.get(i));
            }else {
                王五.add(maps.get(i));
            }
        }

        //偷梁换柱
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"3","4","5","6","7","8","9","1","J","Q","K","A","2","o","O");

        //制定规则
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


        Collections.sort(地主牌,ruler);
        Collections.sort(张三,ruler);
        Collections.sort(李四,ruler);
        Collections.sort(王五,ruler);

        System.out.println("地主牌 = " + 地主牌);
        System.out.println("张三 = " + 张三);
        System.out.println("李四 = " + 李四);
        System.out.println("王五 = " + 王五);


    }
}
