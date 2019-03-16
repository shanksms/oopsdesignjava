package com.shashank.coingame;

public class Coin {
    private CoinSide coinSide;

    public Coin() {

    }

    public CoinSide getCoinSide() {
        this.coinSide = Math.random() < 0.5 ? CoinSide.HEAD : CoinSide.TAIL;
        return coinSide;

    }


}
