package com.hhs.basic;

interface A{
    int x = 0;
}
class B{
    int x = 1;
}
class Question26 extends B implements A{
    public void printX(){
        //System.out.println(x);
    }
    public static void main(String[] args) {
        new Question26().printX();
    }
}
