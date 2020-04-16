package com.codecool.termlib;


public class Player {
    int x = 35;
    int y = 3;
    int HP = 100;
    int att = 10;
    int def = 8;
    String body = "&";
    boolean key = false;
    boolean golds = false;
    boolean battle = false;
    public final String hasKey = "You've got a key";
    public final String hasGold = "You've got Golds";
    private String sword = "short sword";

   
    public void setKey(boolean have) {
        key = have;
    }

    public void setHP(int damage) {
        this.HP -= damage;
    }

    public void setXpositive() {
        this.x = this.x + 1;
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

    public boolean battle() {
        this.battle = true;
        Enemy enemy = new Enemy();
        int enemyHp = enemy.getHP();
        int enemyAtt = enemy.getAtt();
        boolean won = true;
        while (this.HP > 0 || enemyHp > 0) {
            if (this.att > enemyAtt) {
                enemyHp -= this.att;
            } else {
                setHP(enemy.getAtt());
            }
        
        if (enemyHp <= 0) {
            won = true;
        }
        if (this.HP <= 0) {
            won = false;
        }
        }
        return won;
    }
}