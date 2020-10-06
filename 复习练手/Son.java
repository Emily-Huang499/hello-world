package com.indi.thisreview;

public class Son extends Father{
    @Override
    public void doGet() {
        System.out.println("Son doGet is run...");
    }

    @Override
    public void doPost() {
        System.out.println("Son doPost is run...");
    }
}
