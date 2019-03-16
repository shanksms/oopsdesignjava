package com.shashank.coingame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoinGame coinGame = new CoinGame(
                new Player("Tom"),
                new Player("Harry"),
                new Coin());

        String userChoice = null;
        do {
            coinGame.startGame();
            System.out.println("Play again? Y/N");
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextLine();

        } while (userChoice.equals("Y"));

    }
}
