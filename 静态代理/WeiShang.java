package com.emily.shop;

import com.emily.factory.UsbKingFactory;
import com.emily.factory.UsbSanFactory;
import com.emily.service.UsbSell;

public class WeiShang implements UsbSell {
    UsbSell sanFactory = new UsbSanFactory();
    @Override
    public float sell(int amount) {
        float price = sanFactory.sell(amount);
        price = price + 5;
        return price;
    }
}
