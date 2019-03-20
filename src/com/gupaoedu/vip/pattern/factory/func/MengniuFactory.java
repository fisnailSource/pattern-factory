package com.gupaoedu.vip.pattern.factory.func;

import com.gupaoedu.vip.pattern.factory.Mengniu;
import com.gupaoedu.vip.pattern.factory.Milk;

/**
 * 生产单一品种产品
 */
public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
