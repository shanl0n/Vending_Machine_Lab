package com.codebase.machine;

import com.codebase.money.Coin;

import java.util.ArrayList;

public class CoinReturn {
	private final ArrayList<Coin> coins;

public CoinReturn() {
		coins = new ArrayList<>();
	}

	public void addCoin(Coin coin) {
	if (coin.getValue() >= .05) {
			this.coins.add(coin);
	} else {
			System.out.println("Machine does not accept one and two pence coins");
		}
	}

	public double getTotal() {
		double total = 0;
		for (Coin coin : this.coins) {
			total += coin.getValue();
		}
		return total;
	}
}
