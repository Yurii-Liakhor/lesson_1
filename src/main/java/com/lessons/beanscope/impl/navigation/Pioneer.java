package com.lessons.beanscope.impl.navigation;

import com.lessons.beanscope.interfaces.NavigationSystem;


public class Pioneer implements NavigationSystem {
    public boolean createRoute() {
        System.out.println("*****************************");
        System.out.println("Route was created by Pioneer");
        System.out.println("*****************************");
        return true;
    }
}
