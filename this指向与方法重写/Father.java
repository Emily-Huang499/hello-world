package com.indi.thisreview;

public class Father {
    public void service(String method){
        if("get".equals(method)){
            this.doGet();
        }else if ("post".equals(method)){
            this.doPost();
        }
    }
    public void doGet(){
        System.out.println("Father doGet is run..");
    }
    public void doPost(){
        System.out.println("Father doPost is run..");
    }
}
