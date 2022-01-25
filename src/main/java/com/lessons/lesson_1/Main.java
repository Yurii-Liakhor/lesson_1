package com.lessons.lesson_1;


import com.lessons.lesson_1.utils.Utils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lessons.lesson_1.impl.car.Batmobile;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Batmobile batmobile = ctx.getBean(Batmobile.class);
        batmobile.move();
        Utils.sleep(5000);
        batmobile.stop();
    }
}
