package applicationBanque;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAO<T> {

	protected Connection connect = null;
	
	public DAO(Connection conn) {
		this.connect = conn;
	}
	
	public abstract void create(T obj) throws SQLException;
	
	public abstract void delete(T obj) throws SQLException;
	
	public abstract void update(T obj) throws SQLException;
	
	public abstract T find(int id);
}
