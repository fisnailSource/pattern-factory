package com.gupaoedu.vip.pattern.factory.simple;

import com.gupaoedu.vip.pattern.factory.*;

public class SimpleFactory {
    public Milk getMilk(String name) {
        if ("特仑苏".equals(name)) {
            return new Telunsu();
        } else if ("蒙牛".equals(name)) {
            return new Mengniu();
        } else if ("伊利".equals(name)) {
            return new Yili();
        }else if ("三鹿".equals(name)){
            return new Sanlu();
        }else {
            System.out.println("不能生产");
            return null;
        }

    }
}
