package com.gupaoedu.vip.pattern.factory.func;

import com.gupaoedu.vip.pattern.factory.Milk;
import com.gupaoedu.vip.pattern.factory.Sanlu;

public class SanluFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
