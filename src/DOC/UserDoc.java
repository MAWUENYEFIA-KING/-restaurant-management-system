/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOC;

import MODEL.User;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author MAWUENYEFIA HUNORKPA
 */
public class UserDoc {

    public static void save(User user) {
        String query = "INSERT INTO user (name, email, mobileNumber, address, password, securityQuestion, answer, status) VALUES "
                + "('" + user.getName() + "', '" + user.getEmail() + "', '" + user.getMobile_number() + "', '" + user.getAddress() + "', '"
                + user.getPassword() + "', '" + user.getSecurity_question() + "', '" + user.getAnswer() + "', 'false')";

        Db_Operation.setDataOrDelete(query, "Registered successfully! Please wait for Admin Approval");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            String query = "SELECT * FROM user WHERE BINARY email = ? AND BINARY password = ?";
            Connection con = Connection_Provider.getCon();
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobile_number(rs.getString("mobileNumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurity_question(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
                user.setStatus(rs.getString("status"));
            }

            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = Db_Operation.getData("select *from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurity_question(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password='" + newPassword + "'where email='" + email + "' ";
        Db_Operation.setDataOrDelete(query, "Password changed Successfully");
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Db_Operation.getData("select *from user where email like '%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobile_number(rs.getString("mobileNumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurity_question(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;

    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status ='" + status + "'where email='" + email + "'";
        Db_Operation.setDataOrDelete(query, "Status changed Successfully");
    }

    public static void ChangePassword(String email, String OldPassword, String NewPassword) {
        try {
            ResultSet rs = Db_Operation.getData("select *from user where email='" + email + "'and password='" + OldPassword + "' ");
            if (rs.next()) {
                update(email, NewPassword);
            } else {
                JOptionPane.showMessageDialog(null, "The Old Password is incorrect");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void changesecurityQuestion(String email, String password, String securityQuestion, String answer) {
        try {
            ResultSet rs = Db_Operation.getData("select *from user where email='" + email + "' and password ='" + password + "' ");
            if (rs.next()) {
                update(email, securityQuestion, answer);
            } else {
                JOptionPane.showMessageDialog(null, "The password you entered is incorrect");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void update(String email, String securityQuestion, String answer) {
        String query = "update user set securityQuestion= '" + securityQuestion + "',answer='" + answer + "' where email='" + email + "'";
        Db_Operation.setDataOrDelete(query, "Security question changed successfully");

    }
}
