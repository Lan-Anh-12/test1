package cinema.ConnectionDB;

import java.util.Properties;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDB {
    private static Connection connection = null;

    public static Connection getConnection(){
        if(connection != null) {
            return connection;
        }
        try( InputStream input = ConnectionDB.class.getClassLoader().getResourceAsStream("db.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            String url = prop.getProperty("db.url");
            String user = prop.getProperty("db.username");
            String password = prop.getProperty("db.password");
            String driver = prop.getProperty("db.driver");

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            

        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return connection;
    }
}
