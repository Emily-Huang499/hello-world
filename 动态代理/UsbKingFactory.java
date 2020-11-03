package com.emily.factory;

import com.emily.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }
}
