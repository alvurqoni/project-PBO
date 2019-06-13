/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubez;

/**
 *
 * @author aka
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Database {
    Connection con;
    public Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubes","root","");
            JOptionPane.showMessageDialog(null, "Konesi ke Database BERHASIL");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Konesi ke Database GAGAL");
        }
        return con;
    }
}

