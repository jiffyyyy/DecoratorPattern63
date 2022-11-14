import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressoSoyMilk() {
		Beverage b1 = new Espresso();
//		System.out.println(b1.getDescription());
//		System.out.println(b1.cost());
		assertEquals("Espresso", b1.getDescription());
		b1 = new Soy(b1);
		b1 = new SteamedMilk(b1);
		assertEquals("Espresso, Soy, SteamedMilk", b1.getDescription());
		assertEquals(2.24,b1.cost());
		
	}
	@Test
	void testHouseBlendMocha() {
		Beverage b2 = new HouseBlend();
		b2 = new Mocha(b2);
		assertEquals("HouseBlend, Mocha", b2.getDescription());
		assertEquals(1.09,b2.cost());
		
	}

}
