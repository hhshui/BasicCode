package com.hhs.basic.basicprogramming;

public class Question6 {
    public static void main(String[] args) {
        printStar(5);
    }
    public static void printStar(int n){
        for (int i = 1; i <= n; i++) {
            int a = 2*n -i - 1;
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
