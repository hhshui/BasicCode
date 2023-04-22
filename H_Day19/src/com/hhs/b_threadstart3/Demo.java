package com.hhs.b_threadstart3;

import com.hhs.b_threadstart3.MyTarget;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyTarget myTarget = new MyTarget();

        FutureTask<String> task = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("女神：小名，我好喜欢你啊！！！我要给你生孩子！！！");
                }
                return "我拒绝！";
            }
        });

        Thread thread = new Thread();
        thread.start();

        for (int i = 1; i <= 100; i++) {
            System.out.println("女汉子：小名，我好喜欢你啊！！！我要给你生孩子！！！");
        }

        String s = task.get();
        System.out.println(s);
    }
}
