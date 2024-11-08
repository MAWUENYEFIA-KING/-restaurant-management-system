package DOC;

import javax.swing.JOptionPane;

/**
 *
 * @author MAWUENYEFIA HUNORKPA
 */
public class Tables {
    public static void main (String[] args){
        try {
             String userTable = "CREATE TABLE user (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), email VARCHAR(200) UNIQUE, mobileNumber VARCHAR(10), address VARCHAR(200), password VARCHAR(200), securityQuestion VARCHAR(200), answer VARCHAR(200), status VARCHAR(20))";
             String adminDetails =  "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','Admin@gmail.com','0554303832','Ghana','Admin','what is your favourite food ?','ABC','true')";
             String CategoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
             String ProductTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar (200), price varchar (200) )";
             String BillTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200),email varchar (200),date varchar(50),total varchar (200),createdBy varchar(200))";

            //Db_Operation.setDataOrDelete(userTable, "User Table Created Successfully");
            //Db_Operation.setDataOrDelete(adminDetails, "Admin's Details Added Successfully");
            //Db_Operation.setDataOrDelete(CategoryTable, "Category Table Created Successfully");
            //Db_Operation.setDataOrDelete(ProductTable, "Product  Table Created Successfully");
             //Db_Operation.setDataOrDelete(BillTable, "Bill  Table Created Successfully");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
