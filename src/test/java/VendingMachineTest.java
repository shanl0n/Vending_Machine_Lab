import com.codebase.machine.Code;
import com.codebase.machine.CoinReturn;
import com.codebase.machine.Drawer;
import com.codebase.machine.VendingMachine;
import com.codebase.money.Coin;
import com.codebase.money.CoinType;
import com.codebase.products.Crisp;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class VendingMachineTest {
	VendingMachine vendingMachine;
	CoinReturn coinReturn;
	Drawer drawer;
	Crisp crisp;
	Coin onePence;
	Coin twoPence;
	Coin fivePence;
	Coin tenPence;
	Coin twentyPence;
	Coin fiftyPence;
	Coin onePound;
	Coin twoPound;

	@Before
	public void before() {

		coinReturn = new CoinReturn();
		drawer = new Drawer(Code.A1, 0.65);
		crisp = new Crisp("Flame Grilled Steak", "McCoy's");
		ArrayList<Drawer> drawers = new ArrayList<>();
		drawer.addProduct(crisp);
		drawers.add(drawer);
		vendingMachine = new VendingMachine(drawers, coinReturn);

		onePence = new Coin(CoinType.ONEPENCE);
		twoPence = new Coin(CoinType.TWOPENCE);
		fivePence = new Coin(CoinType.FIVEPENCE);
		tenPence = new Coin(CoinType.TENPENCE);
		twentyPence = new Coin(CoinType.TWENTYPENCE);
		fiftyPence = new Coin(CoinType.FIFTYPENCE);
		onePound = new Coin(CoinType.ONEPOUND);
		twoPound = new Coin(CoinType.TWOPOUND);
	}

	@Test
	public void zeroTotalCredit() {
		assertEquals(0.00, vendingMachine.getTotalCredit(), 0.00001);
	}

	@Test
	public void canAddCoin() {
		vendingMachine.addCoin(fivePence);
		vendingMachine.addCoin(tenPence);
		vendingMachine.addCoin(twentyPence);
		vendingMachine.addCoin(fiftyPence);
		vendingMachine.addCoin(onePound);
		vendingMachine.addCoin(twoPound);
		assertEquals(3.85, vendingMachine.getTotalCredit(), 0.00001);
	}

	@Test
	public void canAcceptAndRejectCoins() {
		vendingMachine.addCoin(onePence);
		vendingMachine.addCoin(twoPence);
		vendingMachine.addCoin(fivePence);
		vendingMachine.addCoin(tenPence);
		vendingMachine.addCoin(twentyPence);
		vendingMachine.addCoin(fiftyPence);
		vendingMachine.addCoin(onePound);
		vendingMachine.addCoin(twoPound);
		assertEquals(3.85, vendingMachine.getTotalCredit(), 0.00001);
		assertEquals(0.03, vendingMachine.getCoinReturn().getTotal(), 0.00001);
	}

	@Test
	public void canVend() {
		vendingMachine.addCoin(onePound);
		Crisp crisp = (Crisp) vendingMachine.vend(Code.A1);
		assertEquals("Flame Grilled Steak", this.crisp.getName());
		assertEquals("McCoy's", this.crisp.getBrand());
		assertEquals(0.35, vendingMachine.getTotalCredit(), 0.00001);
	}
}
