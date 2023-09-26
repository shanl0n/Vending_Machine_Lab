import com.codebase.machine.Code;
import com.codebase.machine.Drawer;
import com.codebase.products.Crisp;
import com.codebase.products.Drink;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DrawerTest {

	Drawer drawer;
	Drink drink;
	Code code;

	@Before
	public void before() {
		drawer = new Drawer(Code.C3, 1.05);
		drink = new Drink("Irn Bru", "Barr");
	}

	@Test
	public void canGetCode() {
		assertEquals(Code.C3, drawer.getCode());
	}

	@Test
	public void canGetPrice() {
		assertEquals(1.05, drawer.getPrice(), 0.00);
	}

	@Test
	public void canAddProduct() {
		drawer.addProduct(drink);
		assertEquals(1, drawer.getProducts().size());
	}

	@Test
	public void canRemoveProduct() {
		drawer.addProduct(drink);
		drawer.removeProduct();
		assertEquals(0, drawer.getProducts().size());
	}
}
