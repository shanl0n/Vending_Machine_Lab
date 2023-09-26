import com.codebase.machine.CoinReturn;
import com.codebase.money.Coin;
import com.codebase.money.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {
	CoinReturn coinReturn;
	Coin coin1;
	Coin coin2;
	Coin coin5;

	@Before
	public void before() {
		coinReturn = new CoinReturn();
		coin1 = new Coin(CoinType.ONEPENCE);
		coin2 = new Coin(CoinType.TWOPENCE);
		coin5 = new Coin(CoinType.FIVEPENCE);
	}

	@Test
	public void isEmpty() {
		assertEquals(0.00, coinReturn.getTotal(), 0.00);
	}

	@Test
	public void canAddCoin() {
		coinReturn.addCoin(coin5);
		coinReturn.addCoin(coin5);
		assertEquals(0.10, coinReturn.getTotal(), 0.00);
	}

	@Test
	public void canRejectOneAndTwo() {
		coinReturn.addCoin(coin1);
		coinReturn.addCoin(coin2);
		coinReturn.addCoin(coin5);
		assertEquals(0.05, coinReturn.getTotal(), 0.00);
	}


}
