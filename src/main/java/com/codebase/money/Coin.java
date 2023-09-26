package com.codebase.money;

public class Coin {

	private CoinType coinType;

	public Coin(CoinType coinType) {
		this.coinType = coinType;
	}

	public CoinType getType() {
		return coinType;
	}

	public Double getValue() {
		return this.coinType.getValue();
	}
}
