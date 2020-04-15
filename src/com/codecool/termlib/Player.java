package com.codecool.termlib;

public class Player {
    int x = 5;
    int y = 22;
    String body = "&";
    boolean key = false;
    public final String VICTORY = "you get the key bro";
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

}