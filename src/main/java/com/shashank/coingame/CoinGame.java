package com.shashank.coingame;

import java.util.List;

public class CoinGame {
    private Player[] players = new Player[2];
    private Coin coin;


    public CoinGame(Player player1, Player player2, Coin coin) {
        this.players[0] = player1;
        this.players[1] = player2;
        this.coin = coin;
    }

    public void startGame() {
        int playerIndex = Math.random() < 0.5 ? 0 : 1;
        Player firstPlayer = players[playerIndex];
        Player secondPlayer = null;
        if (playerIndex == 0) {
            secondPlayer = players[1];
        } else {
            secondPlayer = players[0];
        }

        CoinSide firstPlayerPick = firstPlayer.getPrediction();
        secondPlayer.setPrediction(firstPlayerPick);

        CoinSide winningFlip = this.coin.getCoinSide();
        firstPlayer.didPlayerWin(winningFlip);
        secondPlayer.didPlayerWin(winningFlip);


    }
}
