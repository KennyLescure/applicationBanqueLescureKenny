package applicationBanque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBDD {
	
	private static  String bdd = "jdbc:mysql://localhost:3306/applicationBanque?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    private static final String id = "root";
    private static String mdp = "root";
    private static Connection instance;

    public static Connection getInstance() {
        if (instance == null) {
            try {
                instance = DriverManager.getConnection(bdd, id, mdp);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

}
