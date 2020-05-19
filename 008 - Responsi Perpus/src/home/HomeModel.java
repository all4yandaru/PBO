/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Orenji
 */
public class HomeModel {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpus";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;

    public HomeModel() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public void TambahData(String idanggota, String nama, String idbuku, String judul){
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "INSERT INTO data(id_anggota,nama,id_buku,judul_buku) VALUES('" + idanggota +"','" + nama + "','" + idbuku + "','" + judul + "')";
            statement.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String[][] Cari(String cari){
        int banyak=0;
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "SELECT COUNT(id) as banyak FROM data WHERE id like '%" + cari +"%' OR id_anggota like '%" + cari +"%' "
                    + "OR nama like '%" + cari +"%' OR id_buku like '%" + cari +"%' OR judul_buku like '%" + cari +"%'";
            ResultSet hasil = statement.executeQuery(query);
            hasil.next();
            banyak = hasil.getInt("banyak");
            System.out.println(banyak);
            
            String[][] data = new String[banyak][5];
            
            int jmlData=0;
            statement = (Statement)koneksi.createStatement();
            String query2 = "SELECT * FROM data WHERE id like '%" + cari +"%' OR id_anggota like '%" + cari +"%' "
                    + "OR nama like '%" + cari +"%' OR id_buku like '%" + cari +"%' OR judul_buku like '%" + cari +"%'";
            ResultSet hasil2 = statement.executeQuery(query2);
            
            while (hasil2.next()) {                
                data[jmlData][0] = hasil2.getString("id");
                data[jmlData][1] = hasil2.getString("id_anggota");
                data[jmlData][2] = hasil2.getString("nama");
                data[jmlData][3] = hasil2.getString("id_buku");
                data[jmlData][4] = hasil2.getString("judul_buku");
                jmlData++;
            }
            
            return data;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    public String[][] TampilData(){
        try {
            String[][] data = new String[BanyakData()][5];
            int jmlData=0;
            statement = (Statement)koneksi.createStatement();
            String query = "SELECT * FROM data";
            ResultSet hasil = statement.executeQuery(query);
            
            while (hasil.next()) {                
                data[jmlData][0] = hasil.getString("id");
                data[jmlData][1] = hasil.getString("id_anggota");
                data[jmlData][2] = hasil.getString("nama");
                data[jmlData][3] = hasil.getString("id_buku");
                data[jmlData][4] = hasil.getString("judul_buku");
                jmlData++;
            }
            return data;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    public int BanyakData(){
        int banyak=0;
        
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "SELECT COUNT(id) as banyak FROM data";
            ResultSet hasil = statement.executeQuery(query);
            hasil.next();
            banyak = hasil.getInt("banyak");
            
            System.out.println(banyak);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return banyak;
    }
}
