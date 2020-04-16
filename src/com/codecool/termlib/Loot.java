package com.codecool.termlib;

public class Loot {
    private static int random() {
        int x = (int) (Math.random() * 10);
        System.out.println(x);
        return x;
    }
}