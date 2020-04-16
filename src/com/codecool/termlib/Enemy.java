package com.codecool.termlib;

public class Enemy {
    private static int HP;
    private static int att;
    private static int def;
    public static void main(String[] args) {
        Enemy.HP = setHP();
        Enemy.att = setAtt();
        Enemy.def = setDef();
    }
    public static int setHP() {
        HP = random();
        return HP;
    }
    public static int setAtt() {
        att = random();
        return att;
    }
    public static int setDef() {
        def = random();
        return def;
    }
    private static int random() {
        int x = (int) (Math.random() * 10);
        System.out.println(x);        
        return x;
    }
}
