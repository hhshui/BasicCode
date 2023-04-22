package com.hhs.b_threadstart;

public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.run();

        for (int i = 1; i <= 100; i++) {
            System.out.println("主线程执行了"+i+"次 word");
        }
    }
}
