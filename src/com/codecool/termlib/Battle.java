package com.codecool.termlib;

public class Battle {

    public static void main(Enemy enemy, Player player) {
        int enemyHp = enemy.getHP();
        int enemyAtt = enemy.getAtt();
        int enemyDef = enemy.getDef();
        int enemyDmg = enemy.getDmg();
        int playerHp = player.getHP();
        int playerAtt = player.getAtt();
        int playerDef = player.getDef();
        int playerDmg = player.getDmg();

        while (enemyHp > 0 || playerHp > 0) {
            int turnPlayer = playerAtt - enemyDef;
            if (turnPlayer > 0) {enemy.setHP(playerDmg);}
            int turnEnemy = playerDef - enemyAtt;
            if (turnEnemy < 0) {player.setHP(enemyDmg);}
            if (enemyHp <= 0) {break;}
            if (playerHp <= 0) {break;}
            }
        }
    }




