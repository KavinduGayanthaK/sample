package lk.ijse.sample.db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
    private static DbConnection dbConnection;
    private final static String URL = "jdbc:mysql://localhost:3306/sample";
    private final static Properties props = new Properties();
    private Connection connection;

    static {
        props.setProperty("user","root");
        props.setProperty("password","ijse@1234");
    }
    private DbConnection() {
        try {
            connection = DriverManager.getConnection(URL,props);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DbConnection getInstance(){
        return (dbConnection == null) ? dbConnection = new DbConnection() :dbConnection;
    }
    public Connection getConnection(){return connection;}
}
