import com.codebase.money.Coin;
import com.codebase.money.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

	Coin coin;

	@Before
	public void before() {
		coin = new Coin(CoinType.ONEPOUND);
	}

	@Test
	public void canGetCoinType() {
		assertEquals(CoinType.ONEPOUND, coin.getType());
	}

	@Test
	public void canGetValue() {
		assertEquals(1.0, coin.getValue(), 0.00);
	}
}
