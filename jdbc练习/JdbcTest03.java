package com.emilytest.util;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JdbcTest03 {
    public static void main(String[] args) {
        Map<String,String> userLoginInfo = initUI();
        boolean loginSuccess = login(userLoginInfo);
        System.out.println(loginSuccess ? "登录成功" : "登录失败");
    }

    private static boolean login(Map<String, String> userLoginInfo) {
        return false;
    }

    private static Map<String, String> initUI() {
        Scanner s = new Scanner(System.in);
        System.out.print("用户名：");
        String LoginName = s.next();

        System.out.print("密码：");
        String Loginpwd = s.next();

        Map<String,String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("LoginName",LoginName);
        userLoginInfo.put("Loginpwd",Loginpwd);

        return userLoginInfo;
    }
}
