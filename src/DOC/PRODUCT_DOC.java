/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOC;

import MODEL.PRODUCT;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author MAWUENYEFIA HUNORKPA
 */
public class PRODUCT_DOC {

    public static void save(PRODUCT product) {
        String query = "insert into product(name,category,price) values ('" + product.getName() + "','" + product.getCategory() + "','" + product.getPrice() + "')";
        Db_Operation.setDataOrDelete(query, "Product Added Successfully");
    }

    public static ArrayList<PRODUCT> getAllRecords() {
        ArrayList<PRODUCT> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Db_Operation.getData("select *from product");
            while (rs.next()) {
                PRODUCT product = new PRODUCT();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                arrayList.add(product);
            }
            System.out.println("Products fetched: " + arrayList.size()); // Debugging line
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void update(PRODUCT product) {
        String query = "update product set name ='" + product.getName() + "',category ='" + product.getCategory() + "',price ='" + product.getPrice() + "' where id='" + product.getId() + "'";
        Db_Operation.setDataOrDelete(query, "Product Updated Successfully");
    }

    public static void delete(String id) {
        String query = "delete from product where id='" + id + "'";
        Db_Operation.setDataOrDelete(query, "Product Deleted Successfully");

    }

    public static ArrayList<PRODUCT> getAllRecordsByCategory(String category) {
        ArrayList<PRODUCT> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Db_Operation.getData("select *from product where category='" + category + "' ");
            while (rs.next()) {
                PRODUCT product = new PRODUCT();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<PRODUCT> FilterProductByName(String name, String category) {
        ArrayList<PRODUCT> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Db_Operation.getData("select *from product where name like '&" + name + "&' and category='" + category + "' ");
            while (rs.next()) {
                PRODUCT product = new PRODUCT();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static PRODUCT getProductByName(String name) {
        PRODUCT product = new PRODUCT();
        try {
            ResultSet rs = Db_Operation.getData("select *from product where name='" + name + "' ");
            while (rs.next()) {
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getString(4));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }
}
