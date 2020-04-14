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
            setMap(firstPlayer);
        }
    }
	public static void setMap(Player player) {
	

	String[][] mapMultiDim = new String[24][58];
        String map ="........................................................||" +
                    "|_.......................................................|" +
                    ".|............................_..........................|" +
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
                    try {
                    int index = 0;
                    for (int col = 0; col < mapMultiDim[0].length ; col++) {
                        System.out.println();
                        for (int row = 0; row < mapMultiDim[col].length  ; row ++) {
	if (player.x == col && player.y == row) 
		{mapMultiDim[col][row] = player.body;
	    System.out.print(mapMultiDim[col][row]);}
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
    private int x = 0;
    private int y = 0;
    String body = "O";

    public void setXpositive() {
        this.y = this.y + 1;
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
    
      
