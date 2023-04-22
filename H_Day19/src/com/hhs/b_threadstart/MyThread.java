package com.hhs.b_threadstart;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("线程执行了"+i+"次 hello");
        }
    }
}
