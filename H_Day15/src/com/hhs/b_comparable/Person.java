package com.hhs.b_comparable;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;

    private int sum;

    private int Chinese;

    private int Math;

    private int English;

    public Person() {
    }

    public Person(String name, int sum, int chinese, int math, int english) {
        this.name = name;
        this.sum = sum;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return Chinese + Math + English;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sum='" + sum + '\'' +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                ",总分:"+getSum()+
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum, Chinese, Math, English);
    }


    @Override
    public int compareTo(Person o) {
        //按照总分降序
        int result = o.getSum() - this.getSum();
        //语文降序
        result = result == 0 ? o.Chinese -this.Chinese :result;
        //数学降序
        result = result == 0 ? o.Math -this.Math :result;
        //英语升序
        result = result == 0 ? this.English -o.English :result;
        //姓名首字母升序[默认字符串排序规则]
        result = result == 0 ? this.name.compareToIgnoreCase(o.name) :result;
        //返回结果
        return result;
    }
}
