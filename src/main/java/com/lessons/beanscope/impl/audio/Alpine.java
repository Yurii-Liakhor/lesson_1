package com.lessons.beanscope.impl.audio;

import com.lessons.beanscope.interfaces.AudioSystem;

public class Alpine implements AudioSystem{
    public void playCD() {
        System.out.println("*****************************");
        System.out.println("Music from alpine CD");
        System.out.println("*****************************");
    }

    public void playRadio() {
        System.out.println("*****************************");
        System.out.println("Radio from alpine Radio");
        System.out.println("*****************************");
    }
}
