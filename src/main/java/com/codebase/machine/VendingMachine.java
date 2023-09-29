package com.codebase.machine;

import com.codebase.money.Coin;
import com.codebase.products.Product;

import java.util.ArrayList;

public class VendingMachine {

	private ArrayList<Drawer> drawers;
	private CoinReturn coinReturn;
	private double totalCredit;

	public VendingMachine(ArrayList<Drawer> drawers, CoinReturn coinReturn) {
		this.drawers = new ArrayList<Drawer>(drawers);
		this.coinReturn = new CoinReturn();
		this.totalCredit = 0.00;
	}

	public double getTotalCredit() {
		return totalCredit;
	}

	public CoinReturn getCoinReturn() {
		return coinReturn;
	}

	public void addCoin(Coin coin) {
		if (coin.getType().getValue() <= 0.04) {
			this.coinReturn.addCoin(coin);
		} else {
			this.totalCredit += coin.getValue();
		}
	}

//	public Product vend(Code code){
//		for (Drawer drawer : this.drawers) {
//			if (drawer.getCode() == code && this.totalCredit >= drawer.getPrice()) {
//				this.totalCredit = 0.00;
//				return drawer.removeProduct();
//			}
//		}
//		return null;
//	}

	public Product vend(Code code) {
		for (Drawer drawer : this.drawers) {
			if (drawer.getCode().getValue().equals(code.getValue())) {
				if (this.totalCredit >= drawer.getPrice()) {
					this.totalCredit -= drawer.getPrice();
					return drawer.removeProduct();
				}
			}
		}
		return null;
	}
}
