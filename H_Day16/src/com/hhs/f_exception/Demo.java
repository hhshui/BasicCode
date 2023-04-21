package com.hhs.f_exception;
/*
    JVM如何处理异常 :
        1. 立刻终止程序执行 [遇到异常代码立刻终止]
        2. 在控制台打印异常的信息 :
            a. 告知异常产生的线程
            b. 告知异常的类型
            c. 告知异常产生的原因[异常问题信息]
            d. 告知异常产生的代码位置
            e. 红色字体打印 [System.err]
            f. 开启新线程打印异常的信息
        3. 创建一个此类型异常的对象出现在内存中
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("开始");
        System.out.println(7 / 0);//数学异常类的对象
        System.out.println("结束");
    }
}
