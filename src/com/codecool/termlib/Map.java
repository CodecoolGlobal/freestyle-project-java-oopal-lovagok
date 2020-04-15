package com.codecool.termlib;
public class Map  {
    public void main (Player firstPlayer){
    String[][] mapMultiDim = new String [24][58];
    String map =".........................................................|" +
    "|_.......................................................|" +
    ".|...........K................_..........................|" +
    ".|...........................|...........................|" +
    "/........L...................|...........................|" +
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
    int loot = map.indexOf("L");
    String dot = ".";
    int index = 0;
    String item = "long sword";
    String partOfMap = "";
    String pipeOfMap = "|";
    try {
    for (int col = 0; col < mapMultiDim[0].length ; col++) {
        System.out.println();
        for (int row = 0; row < mapMultiDim[col].length  ; row ++) {
            partOfMap = Character.toString(map.charAt(index));
            
            if (index == keyOfMap && firstPlayer.x == col && firstPlayer.y == row) {                             
                mapMultiDim[col][row] = dot;
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
        }
    }
    catch (Exception exception){
        
    }
    }
}