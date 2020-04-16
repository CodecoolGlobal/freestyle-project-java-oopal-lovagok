package com.codecool.termlib;

public class Player {
    int x = 5;
    int y = 22;
    int HP = 100;
    int attack = 5;
    String body = "&";
    boolean key = false;
    boolean secondKey = false;
    boolean golds = false;
    boolean boss = false;
    public final String hasKey = "You've got a key";
    public final String hasGold = "You've got Golds";
    private String sword = "short sword";

    public void setXpositive() {
        this.x = this.x + 1;
    }

    public void setKey(boolean have) {
        key = have;
    }

    public void setXnegative() {
        this.x = this.x - 1;
    }

    public void setYpositive() {
        this.y = this.y - 1;
    }

    public void setYnegative() {
        this.y = this.y + 1;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String newItem) {
        this.sword = newItem;
    }
    public void setGolds(boolean have) {
        golds = have;
    }
    public void setBoss(boolean done) {
        boss = done;
    }
}