package com.codecool.termlib;

public class Loot {
    private static int random() {
        int x = (int) (Math.random() * 10);
        return x;
    }
    public static boolean openChest() {
        if (random() > 1) {
            return true;
        } else {return false;}
    }
}