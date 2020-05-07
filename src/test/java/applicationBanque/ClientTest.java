package applicationBanque;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

	Client client1 = new Client(15, "Bordeaux", "Pierre");
	Client client2 = new Client();
	
	@Test
    public void testClientCree() {
        Assert.assertNotNull(client1);
        Assert.assertNotNull(client2);
    }
}
