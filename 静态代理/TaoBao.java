package com.emily.shop;

import com.emily.factory.UsbKingFactory;
import com.emily.service.UsbSell;

public class TaoBao implements UsbSell {
    private UsbSell factory = new UsbKingFactory();
    @Override
    public float sell(int amount) {
        float price = factory.sell(amount);
        price = price + 25;
        return price;
    }
}
