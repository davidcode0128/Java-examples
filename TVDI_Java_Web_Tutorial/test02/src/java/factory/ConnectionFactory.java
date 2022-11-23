package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private String driverClassName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:derby://localhost:1527/EmployeeDB";
    private String user = "test";
    private String pass = "tiger";

    private static ConnectionFactory connectionFactory = null;

    private ConnectionFactory() {

        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);

    }

    public static ConnectionFactory getInstance() {
        if (null == connectionFactory) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;

    }
}
