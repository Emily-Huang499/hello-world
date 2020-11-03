package com.emily.service;

public class GoNeng implements HelloService{
    @Override
    public int print(String name) {
        System.out.println("其他人写的功能模块");
        return 2;
    }
}
