package com.emily.factory;

import com.emily.service.UsbSell;

public class UsbSanFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        return 50.0f;
    }
}
