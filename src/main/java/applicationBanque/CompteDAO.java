package applicationBanque;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompteDAO extends DAO<Compte>{
	
	public CompteDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(Compte obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Compte obj) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Compte obj) {
		// TODO Auto-generated method stub
	}

	@Override
	public Compte find(int id) {
		Compte compte = null;
		
		try {
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY
					).executeQuery(
							"SELECT * FROM Compte WHERE numeroCompte=" + id);
			if(result.first())
				if(result.getInt("decouvert") > 0)
				{
					compte = new CompteAvecDecouvert(
					id,
					result.getInt("solde"),
					result.getInt("decouvert")
					);
				}else {
					compte = new CompteSansDecouvert(
					id,
					result.getInt("solde")
					);
				}
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return compte;
	}
	

}
