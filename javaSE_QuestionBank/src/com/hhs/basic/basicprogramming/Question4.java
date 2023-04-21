package com.hhs.basic.basicprogramming;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(f(5));

        System.out.println(g(5));
    }
    //递归
    public static int f(int n) {
        int sum = 0;
        if (n==1){
            return sum+n;
        }
        return f(n-1)+n;
    }
    //非递归
    public static int g(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum =sum + i;
        }
        return sum;
    }

}
