package com.hhs.e_digui;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("getRabbit() = " + getRabbit(20));
    }

    public static int getRabbit(int month){
        if (month == 1 || month == 2){
            return 1;
        }
        return getRabbit(month - 1)+getRabbit(month -2);

    }
}
