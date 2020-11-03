package com.emily.factory;

import com.emily.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        return 85.0f;
    }
}
