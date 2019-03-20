package com.gupaoedu.vip.pattern.factory.func;

import com.gupaoedu.vip.pattern.factory.Milk;
import com.gupaoedu.vip.pattern.factory.Telunsu;

public class FactoryTest {
//
    public static void main(String[] args) {
//        货比三家
//        配置工厂
        System.out.println(new MengniuFactory().getMilk().getName());
    }
}
