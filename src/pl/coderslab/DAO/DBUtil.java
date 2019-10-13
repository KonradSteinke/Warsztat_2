package pl.coderslab.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private final static String URL =
            "jdbc:mysql://localhost:3306/Warsztat_2?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private final static String USER = "root";
    private final static String PASSWORD = "ThinkPadT580";
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

}
