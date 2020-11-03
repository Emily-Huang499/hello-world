package com.emily;

import com.emily.factory.UsbKingFactory;
import com.emily.handler.MySellHandler;
import com.emily.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        UsbSell factory = new UsbKingFactory();
        InvocationHandler handler = new MySellHandler(factory);

        UsbSell proxy = (UsbSell)Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                               factory.getClass().getInterfaces(),
                               handler);
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法" + price);
    }
}
