package spring.impl.tire;

import spring.interfaces.Tire;

public class Rosava implements Tire {
    @Override
    public boolean userTire() {
        System.out.println("*****************************");
        System.out.println("Using tire Rosava");
        System.out.println("*****************************");
        return true;
    }
}
