package applicationBanque;

import org.junit.Assert;
import org.junit.Test;

public class BanqueTest {

	double montant1 = 10;
	double montant2 = 20;
	
	@Test
	public void testFromEuro() {
		Assert.assertEquals(Banque.conversionFromEuro(montant1), 10.8, 0);
	}
}
