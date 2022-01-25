package spring.impl.car;

import spring.impl.engine.Forte;
import spring.impl.tire.Rosava;
import spring.interfaces.Car;
import spring.interfaces.Engine;
import spring.interfaces.Tire;

public class Batmobile implements Car {
    public Engine engine = new Forte();
    public Tire tire = new Rosava();

    public void move() {
        System.out.println("*****************************");
        System.out.println("Audi in action");
        System.out.println("*****************************");
        tire.userTire();
        engine.run();
    }
}
