/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package UI;
import java.sql.*;


/**
 *
 * @author MSII
 */
public class DBMC {

    public static Connection vcon() {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BusManagement",
                "root", "admin");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // or log the exception
        }
        return c;
    }

    public static void main(String[] args) {
        Connection conn = vcon();
        if (conn != null) {
            System.out.println("Connection successful!");
            try {
                conn.close(); // Close the connection when done
            } catch (SQLException e) {
                e.printStackTrace(); // or log the exception
            }
        } else {
            System.out.println("Connection failed!");
        }
    }
  
}
