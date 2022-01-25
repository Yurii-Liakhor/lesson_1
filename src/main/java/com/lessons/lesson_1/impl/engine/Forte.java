package com.lessons.lesson_1.impl.engine;

import com.lessons.lesson_1.interfaces.Engine;

public class Forte implements Engine {
    public void run() {
        System.out.println("*****************************");
        System.out.println("running by Forte");
        System.out.println("*****************************");
    }

    public void stop() {
        System.out.println("*****************************");
        System.out.println("stopping by Forte");
        System.out.println("*****************************");
    }
}
