package com.codecool.termlib;
public class Map  {
    static String[][] mapMultiDim = new String [24][58];
    public void main (Player firstPlayer){
    String map =".............................|...........................|" +
    "|............................|...........................|" +
    "|............................#...........................|" +
    "|............................|...........................|" +
    "/........L...................|...........................|" +
    "|............................|...........................|" +
    "|............................|...........................|" +
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
    for (int row = 0; row < mapMultiDim[0].length ; row++) {
        System.out.println();
        for (int col = 0; col < mapMultiDim[row].length  ; col ++) {
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
                    mapMultiDim[row][col] = "\u001B[35m" + partOfMap + "\u001B[0m";
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
    public static boolean validate(int abszcissza , int oordinata){
        System.out.print(mapMultiDim[abszcissza][oordinata]);
        if (mapMultiDim[abszcissza][oordinata].equals("|")){
            return false;
        }
        return true;
    }
}