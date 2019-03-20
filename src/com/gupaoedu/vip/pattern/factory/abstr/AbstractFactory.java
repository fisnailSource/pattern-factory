package com.gupaoedu.vip.pattern.factory.abstr;

import com.gupaoedu.vip.pattern.factory.Milk;

/**
 * 抽象类是用户的主入口
 */
public abstract class AbstractFactory {
    /**
     * 获得一个蒙牛
     * @return
     */
    public abstract Milk getMengniu();
    public abstract Milk getYili();
    public abstract Milk getTelunsu();
    public abstract Milk getSanlu();

    //公用的方法
}
