package com.lessons.beanscope.impl.navigation;

import com.lessons.beanscope.interfaces.NavigationSystem;


public class Navitel implements NavigationSystem {
    public boolean createRoute() {
        System.out.println("*****************************");
        System.out.println("Route was created by Navitel");
        System.out.println("*****************************");
        return true;
    }
}
