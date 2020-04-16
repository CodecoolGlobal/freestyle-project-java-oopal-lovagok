package com.codecool.termlib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        boolean isGamePlaying = true;
        Player firstPlayer = new Player();
        Map level1 = new Map();
        terminal.clearScreen();
        level1.main(firstPlayer);
        while (isGamePlaying) {
            if (firstPlayer.HP <= 0) {
                terminal.clearScreen();
                System.out.print("You died!");
                isGamePlaying = false;
            }
            if (Final.gameOver == true){
                terminal.clearScreen();
                System.out.print("Congrats you win!");
                break;
            }
            System.out.println("Health Point: " + firstPlayer.HP);
            if (firstPlayer.key) {
                System.out.println(firstPlayer.hasKey);
            }
            if (firstPlayer.golds) {
                System.out.println(firstPlayer.hasGold);
            }
            System.out.println("Which way u want to move?");
            Scanner sc = new Scanner(System.in);
            String move = sc.next();
            if (move.equals("d")) {
               if(Map.validate(firstPlayer.x + 1, firstPlayer.y)) {firstPlayer.setXpositive();}
            }
            else if (move.equals("a")) {
                if (Map.validate(firstPlayer.x - 1, firstPlayer.y)) {
                    firstPlayer.setXnegative();
                }
            }
            else if (move.equals("w")) {
                if (Map.validate(firstPlayer.x, firstPlayer.y - 1)) {firstPlayer.setYpositive();}
            }
            else if (move.equals("s")) {
                if (Map.validate(firstPlayer.x, firstPlayer.y + 1)) {
                    firstPlayer.setYnegative();
                }
            }
            else if (move.equals("exit")) {
                terminal.clearScreen();
                break;
            }
            if (firstPlayer.y < 1) {
                firstPlayer.y = 1;
            }
            else if (firstPlayer.y > 22) {
                firstPlayer.y = 22;
            }
            else if (firstPlayer.x < 1) {
                firstPlayer.x = 1;
            }
            else if (firstPlayer.x > 56) {
                firstPlayer.x = 56;
            }
            terminal.clearScreen();
            level1.main(firstPlayer);
        }
    }
	
}
    
      
