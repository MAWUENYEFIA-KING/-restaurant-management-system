/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOC;

import MODEL.CATEGORY;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author MAWUENYEFIA HUNORKPA
 */
public class CATEGORY_DOC {

    public static void save(CATEGORY category) {
        String query = "insert into category(name) value('" + category.getName() + "')";
        Db_Operation.setDataOrDelete(query, "Category Added Successfully");
    }

    public static ArrayList<CATEGORY> getAllRecords() {
        ArrayList<CATEGORY> arrayList = new ArrayList<>();
        ResultSet rs = null;

        try {
            rs = Db_Operation.getData("select * from category");
            while (rs.next()) {
                CATEGORY category = new CATEGORY();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return arrayList;
    }

    public static void delete(String id) {
        String query = "delete from category where id='" + id + "'";
        Db_Operation.setDataOrDelete(query, "Category Deleted Successfully");
    }
}
