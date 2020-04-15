package com.codecool.termlib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        boolean isGamePlaying = true;
        Player firstPlayer = new Player();
        /* Map level1 = new Map(); */
       /*  for (int col = 0; col < mapMultiDim[0].length ; col++) {
            System.out.println();
            for (int row = 0; row < mapMultiDim[col].length  ; row ++) {
                partOfMap = Character.toString(map.charAt(index));
                
                if (index == keyOfMap && firstPlayer.x == col && firstPlayer.y == row) {                             
                    mapMultiDim[col][row] = level1.dot;
                    firstPlayer.setKey(true);
                    index ++;
                }
                else if (index == loot && firstPlayer.x == col && firstPlayer.y == row) {                             
                    mapMultiDim[col][row] = dot;
                    firstPlayer.setSword(item);
                    index ++;
                }
                else if (firstPlayer.x == col && firstPlayer.y == row)
                {
                mapMultiDim[col][row] = firstPlayer.body;
                System.out.print(mapMultiDim[col][row]);
                index++;
                }
                
                else {
                    if (partOfMap.equals(pipeOfMap)) {
                        mapMultiDim[col][row] = "\u001B[35m" + partOfMap + "\u001B[0m";
                        System.out.print(mapMultiDim[col][row]);
                        index ++;
                    } else {
                        mapMultiDim[col][row] = partOfMap;
                        System.out.print(mapMultiDim[col][row]);
                        index ++;
                    }
                    }
                }
            } */
        
        while (isGamePlaying) {
            if (firstPlayer.key) {
                System.out.println(firstPlayer.VICTORY);
            }
            /* System.out.println(firstPlayer.sword); */
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
            terminal.clearScreen();
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
            Map level1 = new Map();
            level1.main(firstPlayer);
        }
    }
	
}
    
      
