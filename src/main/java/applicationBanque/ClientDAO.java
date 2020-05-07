package applicationBanque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDAO extends DAO<Client> {
	private static ClientDAO instance;
	private static Connection connection = ConnexionBDD.getInstance();
	
	public static ClientDAO getInstance() {
        if(instance == null) {
            instance = new ClientDAO(connection);
        }
        return instance;
    }
	
	public ClientDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void create(Client obj) throws SQLException {
		String sql = "Insert into client (adresse, nom) VALUES ('"+obj.adresse+"', '"+obj.nom+"')";
		Connection conn = ConnexionBDD.getInstance();
		PreparedStatement prepare = conn.prepareStatement(sql);
		prepare.execute();
	}

	@Override
	public void delete(Client obj) throws SQLException {
		String sql = "delete from client where numeroClient='"+obj.numeroClient+"'";
		Connection conn = ConnexionBDD.getInstance();
		PreparedStatement prepare = conn.prepareStatement(sql);
		prepare.execute();
	}

	@Override
	public void update(Client obj) throws SQLException {
		String sql = "update client set adresse='"+obj.adresse+"', nom='"+obj.nom+"' where numeroClient="+obj.numeroClient+"";
		Connection conn = ConnexionBDD.getInstance();
		PreparedStatement prepare = conn.prepareStatement(sql);
		prepare.execute();
	}

	@Override
	public Client find(int id) {
		Client client = new Client();
		
		try {
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM client WHERE numeroClient = " + id);
			
			if(result.first())client = new Client(
					id,
					result.getString("adresse"),
					result.getString("nom"));					
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return client;
	}

}
