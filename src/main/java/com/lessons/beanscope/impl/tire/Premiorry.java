package com.lessons.beanscope.impl.tire;

import com.lessons.beanscope.interfaces.Tire;

public class Premiorry implements Tire {
    @Override
    public boolean userTire() {
        System.out.println("*****************************");
        System.out.println("Using tire Premiorry");
        System.out.println("*****************************");
        return true;
    }
}
