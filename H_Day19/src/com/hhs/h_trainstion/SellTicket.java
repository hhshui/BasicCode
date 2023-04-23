package com.hhs.h_trainstion;

public class SellTicket implements Runnable{
    int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (object){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+" 张票");
                    ticket--;
                }
            }
        }
    }
}
