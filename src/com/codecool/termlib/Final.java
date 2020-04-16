package com.codecool.termlib;

import java.util.Scanner;

public class Final {
        String[] Questions = {"Mike is a butcher. He is 5’10” tall. What does he weigh?","What is full of holes but can still hold water?","What has a mouth, but cannot eat; moves, but has no legs; and has a bank, but cannot put money in it?"};
        String [] GoodAnswers = {"meat","sponge","river"};
        Terminal terminal = new Terminal();
        static boolean gameOver = false;
        public void ending(Player player){
                terminal.clearScreen();
                System.out.println("1. Answer the gatekeeper's question");
                System.out.println("2. Bribe him");
                Scanner sc = new Scanner(System.in);
                String choose = sc.next();
                if(choose.equals("1")){
                    int num = random();
                    System.out.println(Questions[num]);
                    Scanner AnswerScan = new Scanner(System.in);
                    String Answer = AnswerScan.next();
                    gameOver = Answer.equals(GoodAnswers[num]) ? true:false;
                    if (gameOver == false){
                        terminal.clearScreen();
                        player.HP = player.HP-30;
                        if (player.HP <= 0)
                        {gameOver = false;} else {ending(player);}
                    }
                }
                else if(choose.equals("2")){
                    if (player.golds) {
                        gameOver = true;
                    } else {System.out.println("You dont have enough gold!");}
                    }
                }
        
        private static int random() {
            int x = (int) (Math.random() * 3);
            return x;
        }
}