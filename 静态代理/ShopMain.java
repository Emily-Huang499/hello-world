package com.emily;

import com.emily.shop.TaoBao;
import com.emily.shop.WeiShang;

public class ShopMain {
    public static void main(String[] args) {
        TaoBao taobao = new TaoBao();
        float price = taobao.sell(1);
        System.out.println("通过淘宝购买的金士顿u盘价格为" + price);

        WeiShang weiShang = new WeiShang();
        float price2 = weiShang.sell(1);
        System.out.println("通过微商购买的闪迪u盘价格为" + price2);
    }
}
