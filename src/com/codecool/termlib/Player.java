package com.codecool.termlib;

public class Player {
    int x = 5;
    int y = 4;
    int HP = 100;
    String body = "&";
    boolean key = false;
    boolean golds = true;
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

}