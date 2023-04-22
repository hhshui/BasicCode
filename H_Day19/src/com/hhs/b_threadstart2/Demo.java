package com.hhs.b_threadstart2;

public class Demo {
    public static void main(String[] args) {
        MyTarget myTarget = new MyTarget();
        Thread thread = new Thread(myTarget);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("线程任务第"+i+"次执行 ccc");
                }
            }
        });

        thread.start();
        thread1.start();

        for (int i = 1; i <= 100; i++) {
            System.out.println("线程任务第"+i+"次执行 bbb");
        }
    }
}
