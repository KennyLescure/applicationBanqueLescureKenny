package applicationBanque;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CompteTest {
	    
	Compte compteAvecDecouvert = new CompteAvecDecouvert(15, 15000, 250);
	Compte compteSansDecouvert = new CompteSansDecouvert(16, 15000);
	Compte comptePauvre = new CompteSansDecouvert(17, 10);
	
	@Test
    public void testCreateNotNull() {
        Assert.assertNotNull(compteAvecDecouvert);
        Assert.assertNotNull(compteSansDecouvert);
    }
	
	@Test
	public void testCrediter() {
		compteAvecDecouvert.crediter(500);
		Assert.assertEquals(compteAvecDecouvert.solde, 15500, 0);
	}
	
	@Test
	public void testDebiter() {
		compteSansDecouvert.debiter(500);
		Assert.assertEquals(compteSansDecouvert.solde, 14500, 0);
	}
	
	@Test
	public void testDebiterImpossible() throws Exception {
		comptePauvre.debiter(20);
		Assert.assertEquals(comptePauvre.solde, 10, 0);
	}
	
	
}
