package com.shashank.coingame;

public class Main {

    public static void main(String[] args) {
        CoinGame coinGame = new CoinGame(
                new Player("Tom"),
                new Player("Harry"),
                new Coin());

        coinGame.startGame();
    }
}
