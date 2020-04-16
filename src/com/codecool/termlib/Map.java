package com.codecool.termlib;
public class Map  {
    static String[][] mapMultiDim = new String [24][58];
    public void main (Player firstPlayer){
    String map =
    "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" +
    "|F.......................................................|" +
    "|.....................^^^^^^^|||||||||||||||||||||||||||||" +
    "|.....................^^^^^^^|...................E.......|" +
    "|.....................^^^^^^^|......E....................|" +
    "|.....................^^^^^^^|...........................|" +
    "|............................#...................E.......|" +
    "|............................|...........................|" +
    "|............................|...........................|" +
    "|............................|........E..................|" +
    "|...........||||||||||||||||||...........................|" +
    "|...........|S...........................................|" +
    "|...........|............................................|" +
    "|...........|||||||||||||||||||#|||||||||||||||||||||....|" +
    "|...........|.......................................|....|" +
    "|...........|.|||||||||||||||||||||||||||||||||||||.|....|" +
    "|...........|.|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|.|....|" +
    "|...........|.|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|.|....|" +
    "|...|||||||||.|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|.|....|" +
    "|...|.........|^^^^^^^^^^^^~~~~~~~~~^^^^^^^^^^^^^^|.|....|" +
    "|...|.|||||||||^^^^^^^^^^^~~~~~~~~~~~^^^^^^^^^^^^^|.|....|" +
    "|...|.|^^^^^^^^^^^^^^^^^^^~~~~~~~~~~~^^^^^^^^^^^^^|.|....|" +
    "|...|.|^^^^^^^^^^^^^^^^^^^^~~~~~~~~~^^^^^^^^^^^^^^|K|.L..|" +
    "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
    int keyOfMap = map.indexOf("K");
    int pipe = map.indexOf("|");
    int loot = map.indexOf("L");
    int boss = map.indexOf("E");
    String dot = ".";
    int index = 0;
    String item = "long sword";
    String E = "E";
    String S = "S";
    String F = "F";
    String K = "K";
    String hashTag = "#";
    String partOfMap = "";
    String pipeOfMap = "|";
    String rabbitShitOfMap = "^";
    String littleShit = "~";
    try {
    for (int row = 0; row < 58 ; row++) {
        System.out.println();
        for (int col = 0; col < 58  ; col ++) {
            partOfMap = Character.toString(map.charAt(index));
            
            if (index == keyOfMap && firstPlayer.y == row && firstPlayer.x == col) {                             
                mapMultiDim[row][col] = firstPlayer.body;
                System.out.print(mapMultiDim[row][col]);
                mapMultiDim[row][col] = dot;
                firstPlayer.setKey(true);
                index ++;
            }
            else if (index == loot && firstPlayer.y == row && firstPlayer.x == col) {                             
                mapMultiDim[row][col] = dot;
                firstPlayer.setSword(item);
                index ++;
            }
            else if (firstPlayer.y == row && firstPlayer.x == col)
            {
            mapMultiDim[row][col] = "\033[1;41;30m" + firstPlayer.body + "\033[0m";
            System.out.print(mapMultiDim[row][col]);
            index++;
            }
            else {
                if (partOfMap.equals(pipeOfMap)) {
                    mapMultiDim[row][col] = "\033[1;33m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else if (partOfMap.equals(rabbitShitOfMap)) {
                    mapMultiDim[row][col] = "\033[1;31m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else if (partOfMap.equals(littleShit)) {
                    mapMultiDim[row][col] = "\033[1;32m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else if (partOfMap.equals(dot)) {
                    mapMultiDim[row][col] = "\033[1;34m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else if (partOfMap.equals(F)) {
                    mapMultiDim[row][col] = "\033[2;44m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else if (partOfMap.equals(E)) {
                    mapMultiDim[row][col] = "\033[2;44;30m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else if (partOfMap.equals(K)) {
                    mapMultiDim[row][col] = "\033[2;43;30m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else if (partOfMap.equals(S)) {
                    mapMultiDim[row][col] = "\033[2;30;44m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else if (partOfMap.equals(hashTag)) {
                    mapMultiDim[row][col] = "\033[2;43;30m" + partOfMap + "\033[0m";
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else {
                    mapMultiDim[row][col] = partOfMap;
                    if(firstPlayer.key){
                        mapMultiDim[22][51] = ".";
                        mapMultiDim[13][31] = ".";
                            }
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                }
                }
            } 
        }
    }
    catch (Exception exception){
        System.out.println("level 1");
    }
   
    }
    public static boolean validate(int imagineX , int imagineY){
        String pipe = new String("\u001B[1;33m" + "|" + "\u001B[0m");
        String door = new String("#");
        String nextElement = mapMultiDim[imagineY][imagineX];
        if (nextElement.equals(pipe) || nextElement.equals(door)){
            return false;
        } else {return true;}
    }
}