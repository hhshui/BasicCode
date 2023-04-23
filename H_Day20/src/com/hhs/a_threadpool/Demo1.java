package com.hhs.a_threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();


        for (int i = 0; i <= 40; i++) {
            int j = i;
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":打印 "+j);
                }
            });

        }

        pool.shutdown();
    }
}
