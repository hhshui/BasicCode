package com.hhs.h_trainstion;

public class SellTicket implements Runnable{
    int ticket = 100;


    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (ticket>0){
                System.out.println("卖出了第"+ticket+" 张票");
                ticket--;
            }
        }
    }
}
