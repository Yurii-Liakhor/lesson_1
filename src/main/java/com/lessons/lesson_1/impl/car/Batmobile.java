package com.lessons.lesson_1.impl.car;

import com.lessons.lesson_1.interfaces.Engine;
import com.lessons.lesson_1.interfaces.Tire;
import lombok.Data;
import com.lessons.lesson_1.interfaces.Car;

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
