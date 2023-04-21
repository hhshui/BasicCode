package com.hhs.d_generic;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu<H>{
    H h;
}

class Son extends Fu{
    //父类泛型不可以在子类中使用
    public void show(){
        h = new Object();
        System.out.println("h.getClass() = " + h.getClass());
    }
}

//在继承时把父类泛型写死
class Zi extends Fu<String>{
    public void show(){
        //h = new Object();
        System.out.println("h.getClass() = " + h.getClass());
    }
}
