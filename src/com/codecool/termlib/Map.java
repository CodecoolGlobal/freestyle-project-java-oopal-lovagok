package com.codecool.termlib;
public class Map  {
    static String[][] mapMultiDim = new String [24][58];
    public void main (Player firstPlayer){
    String map =".............................|...........................|" +
    "|............................|...........................|" +
    "|............................#...........................|" +
    "|................|...........|...........................|" +
    "/........L...................|...........................|" +
    "|............................|...........................|" +
    "|...........|................|...........................|" +
    "|............................|...........................|" +
    "|............................|...........................|" +
    "|............................|...........................|" +
    "|...........|----------------|...........................|" +
    "|...........|............................................|" +
    "|...........|............................................|" +
    "|...........|............................................|" +
    "|...........|............................................|" +
    "|...........|............................................|" +
    "|...........|............................................|" +
    "|...........|............................................|" +
    "|...|-------|............................................|" +
    "|...|....................................................|" +
    "|...|....................................................|" +
    "|...|....................................................|" +
    "|.K.|....................................................|" +
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
            mapMultiDim[row][col] = firstPlayer.body;
            System.out.print(mapMultiDim[row][col]);
            index++;
            }
            
            else {
                if (partOfMap.equals(pipeOfMap)) {
                    mapMultiDim[row][col] = partOfMap;
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                } else {
                    mapMultiDim[row][col] = partOfMap;
                    System.out.print(mapMultiDim[row][col]);
                    index ++;
                }
                }
            } 
        }
    }
    catch (Exception exception){

    }
   
    }
    public static boolean validate(int imagineX , int imagineY){
        String pipe = new String("|");
        String nextElement = mapMultiDim[imagineY][imagineX];
        if (nextElement.equals(pipe)){
            return false;
        } else {return true;}
    }
}