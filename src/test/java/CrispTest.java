import com.codebase.products.Crisp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrispTest {
	Crisp crisp;

	@Before
	public void before() {
		crisp = new Crisp("Salt and Vinegar", "Walkers");
	}

	@Test
	public void canGetName() {
		assertEquals("Salt and Vinegar", crisp.getName());
	}
}
