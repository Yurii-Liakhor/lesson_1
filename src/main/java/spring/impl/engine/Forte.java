package spring.impl.engine;

import spring.interfaces.Engine;

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
