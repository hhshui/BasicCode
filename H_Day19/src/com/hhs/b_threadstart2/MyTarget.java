package com.hhs.b_threadstart2;

public class MyTarget implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("线程任务第"+i+"次执行 aaa");
        }
    }
}
