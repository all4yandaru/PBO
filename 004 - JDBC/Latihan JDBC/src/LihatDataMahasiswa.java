import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Orenji
 */
public class LihatDataMahasiswa extends JFrame {
    String[][] data = new String[500][3];
    String[] kolom = {"Nama", "NIM", "Alamat"};
    
    JTable tabel;
    JScrollPane scrollPane;
    String DBurl = "jdbc:mysql://localhost/praktikum";
    String DBusername = "root";
    String DBpassword = "";
    String anu = "com.mysql.jdbc.Driver";
    
    Connection koneksi;
    Statement statement;
    ResultSet rs;
    
    public LihatDataMahasiswa(){
        setTitle("Lihat Data :3");
        
        try {
            Class.forName(anu);
            koneksi = DriverManager.getConnection(DBurl,DBusername, DBpassword);
            statement = koneksi.createStatement();
            
            String sql = "select * from mahasiswa";
            rs = statement.executeQuery(sql);
            
            for (int i = 0; rs.next(); i++) {
                data[i][0] = rs.getString("nama");
                data[i][1] = rs.getString("nim");
                data[i][2] = rs.getString("alamat");
            }
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
        tabel = new JTable(data, kolom);
        scrollPane = new JScrollPane(tabel);
        
        setLayout(new FlowLayout());
        add(scrollPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new LihatDataMahasiswa();
    }
}