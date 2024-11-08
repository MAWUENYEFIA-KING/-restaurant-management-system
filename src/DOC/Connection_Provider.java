/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOC;

import java.sql.*;

/**
 *
 * @author MAWUENYEFIA HUNORKPA
 */
public class Connection_Provider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KING?useSSL=false", "root", "1234");
            return con;
        } catch (Exception e) {

            return null;
        }
    }
}
