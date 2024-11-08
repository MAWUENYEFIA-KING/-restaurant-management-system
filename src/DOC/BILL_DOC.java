/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOC;

import MODEL.BILL;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author MAWUENYEFIA HUNORKPA
 */
public class BILL_DOC {

    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = Db_Operation.getData("select max(id) from bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);

    }

    public static void save(BILL bill) {
        String query = "insert into bill values('" + bill.getId() + "','" + bill.getName() + "','" + bill.getMobileNumber() + "','" + bill.getEmail() + "','" + bill.getDate() + "','" + bill.getTotal() + "','" + bill.getCreatedBy() + "') ";
        Db_Operation.setDataOrDelete(query, "Bill Details Added Successfully");
    }

    public static ArrayList<BILL> getAllRecordsByInc(String date) {
        ArrayList<BILL> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Db_Operation.getData("SELECT * FROM bill WHERE date LIKE '%" + date + "%'");

            while (rs.next()) {
                BILL bill = new BILL();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<BILL> getAllRecordsByDesc(String date) {
        ArrayList<BILL> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Db_Operation.getData("SELECT * FROM bill WHERE date LIKE '%" + date + "%' ORDER BY id DESC");

            while (rs.next()) {
                BILL bill = new BILL();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
