package com.lessons.beanscope.impl.car;

import com.lessons.beanscope.interfaces.Engine;
import com.lessons.beanscope.interfaces.Tire;
import lombok.Data;
import com.lessons.beanscope.interfaces.Car;

@Data
public class Batmobile implements Car {
    private Engine engine;
    private Tire tire;

    public Batmobile(Engine engine, Tire tire) {
        this.engine = engine;
        this.tire = tire;
    }

    public void move() {
        System.out.println("*****************************");
        System.out.println("Audi in action");
        System.out.println("*****************************");
        tire.userTire();
        engine.run();
    }

    @Override
    public void stop() {
        System.out.println("*****************************");
        System.out.println("Audi in action");
        System.out.println("*****************************");
        engine.stop();
    }
}
