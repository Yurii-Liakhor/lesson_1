package com.lessons.lesson_1.impl.audio;

import com.lessons.lesson_1.interfaces.AudioSystem;

public class Sony implements AudioSystem {
    public void playCD() {
        System.out.println("*****************************");
        System.out.println("Music from sony CD");
        System.out.println("*****************************");
    }

    public void playRadio() {
        System.out.println("*****************************");
        System.out.println("Music from sony Radio");
        System.out.println("*****************************");
    }
}
