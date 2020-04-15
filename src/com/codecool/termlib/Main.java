package com.codecool.termlib;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
        boolean isGamePlaying = true;
        Player firstPlayer = new Player();
        setMap(firstPlayer);
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
            clearScreen();
            if (firstPlayer.x < 0) {
                firstPlayer.x = 0;
            }
            else if (firstPlayer.x > 23) {
                firstPlayer.x = 23;
            }
            else if (firstPlayer.y < 0) {
                firstPlayer.y = 0;
            }
            else if (firstPlayer.y > 57) {
                firstPlayer.y = 57;
            }
            setMap(firstPlayer);
        }
    }
	public static void setMap(Player player) {
	Terminal terminal = new Terminal();

	String[][] mapMultiDim = new String[24][58];
        String map =".........................................................|" +
                    "|_.......................................................|" +
                    ".|...........K................_..........................|" +
                    ".|...........................|...........................|" +
                    "/............................|...........................|" +
                    "|............................|...........................|" +
                    "|............................|...........................|" +
                    "|............................|...........................|" +
                    "|............................|...........................|" +
                    "|............................|...........................|" +
                    "|...........||||||||||||||||||...........................|" +
                    "|...........|............................................|" +
                    "|...........|............................................|" +
                    "|...........|............................................|" +
                    "|...........|............................................|" +
                    "|...........|............................................|" +
                    "|...........|............................................|" +
                    "|...........|............................................|" +
                    "|...|||||||||............................................|" +
                    "|...|....................................................|" +
                    "|...|....................................................|" +
                    "|...|....................................................|" +
                    "|.C.|....................................................|" +
                    "|___|____________________________________________________|";
                    int keyOfMap = map.indexOf("K");
                    int pipe = map.indexOf("|");

                    try {
                    int index = 0;
                    for (int col = 0; col < mapMultiDim[0].length ; col++) {
                        System.out.println();
                        for (int row = 0; row < mapMultiDim[col].length  ; row ++) {
                            
                            if (index == keyOfMap && player.x == col && player.y == row) {                             
                                mapMultiDim[col][row] = "X";
                                player.setKey(true);
                                index ++;
                            }
                            else if (player.x == col && player.y == row)
                            {
                            mapMultiDim[col][row] = player.body;
                            System.out.print(mapMultiDim[col][row]);
                            index++;
                            }
                            
                            else {
                                    mapMultiDim[col][row] = Character.toString(map.charAt(index));
                            System.out.print(mapMultiDim[col][row]);
                                    index ++;
                            }
                                }
                            }
                            }
                            catch (Exception arrException) {
                                    System.out.println();         
                                }

}
public static class Player {
    private int x = 2;
    private int y = 7;
    String body = "O";
    boolean key = false;
    public final String VICTORY = "you get the key bro";

    public void setXpositive() {
        this.y = this.y + 1;
    }
    public void setKey(boolean have) {
        key = have;
    }
    public void setXnegative() {
        this.y = this.y - 1;
    }
    public void setYpositive() {
        this.x = this.x - 1;
    }
    public void setYnegative() {
        this.x = this.x + 1;
    }
    
}

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
    
      
