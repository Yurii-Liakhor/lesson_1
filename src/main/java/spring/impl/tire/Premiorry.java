package spring.impl.tire;

import spring.interfaces.Tire;

public class Premiorry implements Tire {
    @Override
    public boolean userTire() {
        System.out.println("*****************************");
        System.out.println("Using tire Premiorry");
        System.out.println("*****************************");
        return true;
    }
}
