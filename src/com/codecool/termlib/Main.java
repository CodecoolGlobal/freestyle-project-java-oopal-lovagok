package com.codecool.termlib;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
        Color first = Color.BLUE;
        Attribute second = Attribute.BRIGHT;
	    Player firstPlayer = new Player();
	    setMap(firstPlayer);

    }
	public static void setMap(Player player) {
	

	String[][] mapMultiDim = new String[24][58];
        String map = ".........................................................." +
                    ".........................................................." + 
                    ".............................||||||||||||||||||||||||||||F" +
                    ".............................|............................" +
                    ".............................|............................" +
                    ".............................|............................" +
                    ".............................|............................" +
                    ".............................|............................" +
                    ".............................|............................" +
                    ".............................|............................" +
                    "............||||||||||||||||||............................" +
                    "............|............................................." +
                    "............|............................................." +
                    "............|............................................." +
                    "............|............................................." +
                    "............|............................................." +
                    "............|............................................." +
                    "............|............................................." +
                    "....|||||||||............................................." +
                    "....|....................................................." +
                    "....|....................................................." +
                    "....|....................................................." +
                    "....|....................................................." +
                    "....C.....................................................";
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
    int x = 0;
    int y = 0;
    String body = "O";

//    public void keyPressed(KeyEvent e) {
//
//        int key = e.getKeyCode();
//
//        if (key == KeyEvent.VK_LEFT) {
//            dx = -1;
//        }
//
//        if (key == KeyEvent.VK_RIGHT) {
//            dx = 1;
//        }
//
//        if (key == KeyEvent.VK_UP) {
//            dy = -1;
//        }
//
//        if (key == KeyEvent.VK_DOWN) {
//            dy = 1;
//        }
//    }
//
//    public void keyReleased(KeyEvent e) {
//
//        int key = e.getKeyCode();
//
//        if (key == KeyEvent.VK_LEFT) {
//            dx = 0;
//        }
//
//        if (key == KeyEvent.VK_RIGHT) {
//            dx = 0;
//        }
//
//        if (key == KeyEvent.VK_UP) {
//            dy = 0;
//        }
//
//        if (key == KeyEvent.VK_DOWN) {
//            dy = 0;
//        }
//    }
//
//    public void move() {
//
//        x += dx;
//        y += dy;
//    }
}
}
    
      
