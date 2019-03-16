package com.shashank.coingame;

public class Player {
    private String name;
    private CoinSide prediction;

    public Player(String name) {
        this.name = name;
    }

    public CoinSide getPrediction() {
        this.prediction = Math.random() < 0.5 ? CoinSide.HEAD : CoinSide.TAIL;
        return prediction;
    }

    public void setPrediction(CoinSide opponentPrediction) {
        if (opponentPrediction.equals(CoinSide.HEAD)) {
            this.prediction = CoinSide.TAIL;
        } else {
            this.prediction = CoinSide.HEAD;
        }

    }

    public void didPlayerWin(CoinSide winningSide) {
        if (prediction.equals(winningSide)) {
            System.out.println(name + " won");
        } else {
            System.out.println(name + " lost");
        }

    }


}
