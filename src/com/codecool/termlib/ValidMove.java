package com.codecool.termlib;


public class ValidMove {
    public static boolean main(Player player, String move) {
        boolean isPlaying = true;
        Integer[] notValidMoves = {1, 22, 56};
        Integer x = player.x;
        Integer y = player.y;
        switch (move) {
                case "d":
                for (Integer i: notValidMoves) {
                    if (y.intValue() == i.intValue()) {
                        player.setXnegative();
                        player.setXnegative();
                        }
                    }
                    player.setXpositive();
                    break;
            case "a":
                for (Integer i: notValidMoves) {
                    if (y.intValue() == i.intValue()) {
                        player.setXpositive();
                        player.setXpositive();
                        }
                    }
                    player.setXnegative();
                    break;
                case "w":
                for (Integer i: notValidMoves) {
                    if (x.intValue() == i.intValue()) {
                        player.setYpositive();
                        player.setYpositive();
                        }
                    }
                    player.setYnegative();
                    break;
                case "s":
                for (Integer i: notValidMoves) {
                    if (x.intValue() == i.intValue()) {
                        player.setYnegative();
                        player.setYnegative();
                        }
                    }
                    player.setYpositive();
                    break;
                case "exit":
                isPlaying = false;
                break;
                }
                return isPlaying;
        }
    }