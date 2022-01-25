package com.lessons.beanscope.impl.engine;

import com.lessons.beanscope.interfaces.Engine;

public class Vitals implements Engine {
    public void run() {
        System.out.println("*****************************");
        System.out.println("running by Vitals");
        System.out.println("*****************************");
    }

    public void stop() {
        System.out.println("*****************************");
        System.out.println("stopping by Vitals");
        System.out.println("*****************************");
    }
}
