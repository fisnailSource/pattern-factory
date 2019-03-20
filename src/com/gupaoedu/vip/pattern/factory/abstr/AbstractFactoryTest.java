package com.gupaoedu.vip.pattern.factory.abstr;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
//        对用户而言,直接选择所需的产品
//        配置,可能会配置错
//        用户只能选定定制好的,避免出错
        System.out.println(milkFactory.getSanlu().getName());
    }
}
