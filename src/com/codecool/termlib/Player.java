package com.codecool.termlib;

public class Player {
    int x = 1;
    int y = 1;
    String body = "O";
    boolean key = false;

    public void setX(int newX) {
        x += newX;
    }
    public void setKey(boolean have) {
        key = have;
    }
}