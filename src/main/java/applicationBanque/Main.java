package applicationBanque;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		ClientDAO client = ClientDAO.getInstance();
		
		//test insert dans bdd nv client
		//client.create(new Client(1, "metz", "lescure"));
		
		//test delete client de BDD
		//client.delete(new Client(2, "delete", "delete"));
		
		//test update client BDD
		//client.update(new Client(1, "paris", "george"));
		
	}

}
