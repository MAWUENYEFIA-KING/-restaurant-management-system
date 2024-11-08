/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMMON;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author MAWUENYEFIA HUNORKPA
 */
public class OPEN_PDF {
    public static void OpenById(String id){
    try{
        
    if((new File("C:\\\\Users\\\\MAWUENYEFIA HUNORKPA\\\\Desktop\\\\NETBEANS PROJECT\\\\MAWUENYEFIA'S RESTAURANT\\\\RECORDS\\\\"+id+".pdf")).exists()){
        Process p = Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FileProtocolHandler C:\\\\Users\\\\MAWUENYEFIA HUNORKPA\\\\Desktop\\\\NETBEANS PROJECT\\\\MAWUENYEFIA'S RESTAURANT\\\\RECORDS\\\\" +id+ ".pdf");           
       }
    else
        JOptionPane.showMessageDialog(null, "File does not exist");
    
     }
    
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
     }
   }
}
