package com.gupaoedu.vip.pattern.factory.abstr;

import com.gupaoedu.vip.pattern.factory.*;
import com.gupaoedu.vip.pattern.factory.func.MengniuFactory;
import com.gupaoedu.vip.pattern.factory.func.TelunsuFactory;
import com.gupaoedu.vip.pattern.factory.func.YiliFactory;

public class MilkFactory extends AbstractFactory  {
    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMilk();
    }

    @Override
    public Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }

    @Override
    public Milk getSanlu() {
        return new Sanlu();
    }
}
