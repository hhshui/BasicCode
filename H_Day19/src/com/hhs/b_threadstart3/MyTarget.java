package com.hhs.b_threadstart3;

import java.util.concurrent.Callable;

public class MyTarget implements Callable<String> {


    @Override
    public String call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            System.out.println("女神：小名，我好喜欢你啊！！！我要给你生孩子！！！");
        }
        return "我拒绝！";
    }
}
