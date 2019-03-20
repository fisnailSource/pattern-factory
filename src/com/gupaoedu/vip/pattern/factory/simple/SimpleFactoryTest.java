package com.gupaoedu.vip.pattern.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        //new 比较复杂
        //有人民币不用自己new了
//        System.out.println(new Telunsu().getName());
//        各种牛奶配比不一样
        SimpleFactory factory = new SimpleFactory();
//        将用户需求告诉工厂,将创建产品的过程隐藏,用户不知道产品怎么产生的.
        System.out.println(  factory.getMilk("特仑苏").getName());

      ;
    }
}
