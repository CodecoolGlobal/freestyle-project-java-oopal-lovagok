package com.codecool.termlib;


public class Battle {
    Terminal terminal = new Terminal();
    public void battle(Player player, Enemy enemy) {
       while (player.HP > 0 && enemy.HP > 0) {
           enemy.HP = enemy.HP - player.attack;
           player.HP = player.HP - enemy.att;
       }
    }
}