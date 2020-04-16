package com.codecool.termlib;

public class Enemy {
    private int HP;
    private int att;
    private int def;
    private int dmg;

    
    public Enemy() {
        this.HP = giveHP();
        this.att = setAtt();
        this.def = setDef();
        this.dmg = setDmg();
    }

    public static int giveHP() {
        int HP = random();
        return HP;
    }
    public static int setAtt() {
        int att = random();
        return att;
    }
    public static int setDef() {
        int def = random();
        return def;
    }
    public static int setDmg() {
        int dmg = random();
        return dmg;
    }
    private static int random() {
        int x = (int) (Math.random() * 10);
        return x;
    }
    public int getHP() {
        return HP;
    }
    public int getAtt() {
        return att;
    }
    public int getDef() {
        return def;
    }
    public int getDmg() {
        return dmg;
    }
    public void setHP(int dmg) {
        this.HP -= dmg;
    }
}
