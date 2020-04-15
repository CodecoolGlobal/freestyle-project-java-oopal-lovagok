package com.codecool.termlib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        boolean isGamePlaying = true;
        Player firstPlayer = new Player();
        Map level1 = new Map();
        level1.main(firstPlayer);
        while (isGamePlaying) {
            if (firstPlayer.key) {
                System.out.println(firstPlayer.VICTORY);
            }
            System.out.println("Which way u want to move?");
            Scanner sc = new Scanner(System.in);
            String move = sc.next();
            
            if (move.equals("d")) {
               firstPlayer.setXpositive();
            }
            else if (move.equals("a")) {
                firstPlayer.setXnegative();
            }
            else if (move.equals("w")) {
                firstPlayer.setYpositive();
            }
            else if (move.equals("s")) {
                firstPlayer.setYnegative();
            }
            else if (move.equals("exit")) {
                isGamePlaying = false;
            }
            if (firstPlayer.x < 1) {
                firstPlayer.x = 1;
            }
            else if (firstPlayer.x > 22) {
                firstPlayer.x = 22;
            }
            else if (firstPlayer.y < 1) {
                firstPlayer.y = 1;
            }
            else if (firstPlayer.y > 56) {
                firstPlayer.y = 56;
            }
            terminal.clearScreen();
            level1.main(firstPlayer);
        }
    }
	
}
    
      
