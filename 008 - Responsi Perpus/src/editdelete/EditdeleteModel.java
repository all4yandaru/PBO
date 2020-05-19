/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editdelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Orenji
 */
public class EditdeleteModel {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpus";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;

    public EditdeleteModel() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public void update(String id, String nama, String idbuku){
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "UPDATE data SET nama = '" + nama + "', id_buku = '" + idbuku + "' WHERE id = '" + id + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void delete(String id){
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "DELETE FROM data WHERE id = '" + id + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
