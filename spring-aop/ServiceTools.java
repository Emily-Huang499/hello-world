package com.emily.util;

import java.util.Date;

public class ServiceTools {
    public static void doLog(){
        System.out.println("非业务方法，方法的执行时间=" + new Date());
    }
    public static void doTrans(){
        System.out.println("非业务方法，方法执行完毕后，提交事务");
    }
}
