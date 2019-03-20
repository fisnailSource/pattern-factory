package com.gupaoedu.vip.pattern.factory.func;

import com.gupaoedu.vip.pattern.factory.Milk;

/**
 * 工厂模型
 */
public interface Factory {
//    工厂有生产产品的技能,唯一产品出口
    Milk getMilk();
}
