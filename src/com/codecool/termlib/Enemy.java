package com.codecool.termlib;

public class Enemy {
    int HP;// = 100;
    int att;// = 2;
    int def;// = 2;

    public Enemy() {
        HP = setHP();
        att = setAtt();
        def = setDef();
    }

    public int getHP() {
        return HP;
    }

    public int getAtt() {
        return att;
    }

    public static int setHP() {
        int randInt = random();
        return randInt;
    }
    public static int setAtt() {    
        int randInt = random();
        return randInt;
    }
    public static int setDef() {
        int randInt = random();
        return randInt;
    }
    private static int random() {
        int x = (int) (Math.random() * 10);
            return x;
    }
}