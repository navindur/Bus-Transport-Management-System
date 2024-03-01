/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kumar
 */
public class DatabaseConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/busmanagement"; // Change this URL to match your database
    private static final String DB_USER = "root"; // Database username
    private static final String DB_PASSWORD = "MYsql2023#"; // Database password

    private static Connection connection;

    // Private constructor to prevent instantiation from outside
    private DatabaseConnection() {
    }

    // Method to get a database connection
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL JDBC driver
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    // Close the connection when done
//    public static void closeConnection() {
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
