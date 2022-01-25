package com.lessons.beanscope.impl.navigation;

import com.lessons.beanscope.interfaces.NavigationSystem;


public class Garmin  implements NavigationSystem {
    public boolean createRoute() {
        System.out.println("*****************************");
        System.out.println("Route was created by Garmin");
        System.out.println("*****************************");
        return true;
    }
}
