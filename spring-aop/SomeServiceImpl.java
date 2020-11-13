package com.emily.service.impl;

import com.emily.service.SomeService;
import com.emily.util.ServiceTools;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
//        ServiceTools.doLog();
        System.out.println("执行业务方法doSome");
//        ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");
    }
}
