package com.codebase.machine;

import com.codebase.money.Coin;

import java.util.ArrayList;

public class CoinReturn {
	private final ArrayList<Coin> coins;

public CoinReturn() {
		coins = new ArrayList<>();
	}

	public void addCoin(Coin coin) {
		this.coins.add(coin);
	}

	public double getTotal() {
		double total = 0;
		for (Coin coin : this.coins) {
			total += coin.getValue();
		}
		return total;
	}
}
