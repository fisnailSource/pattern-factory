package com.gupaoedu.vip.pattern.factory.func;

import com.gupaoedu.vip.pattern.factory.Milk;
import com.gupaoedu.vip.pattern.factory.Telunsu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
