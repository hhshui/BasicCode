package com.hhs.basic.basicprogramming;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("f(3) = " + f(4));
    }
    public static int f(int n){
        if (n == 1){
            return 1;
        }
        return f(n-1)+g(n);
    }
    public static int g(int n){
        if (n == 1){
            return 1;
        }
        return g(n-1)*n;
    }


    /*public static int f(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 1;
            for (int j = 1; j <= i; j++) {
                tmp=tmp*j;
            }
            sum = sum +tmp;
        }
        return sum;
    }*/
    }

    //递归
