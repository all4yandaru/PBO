import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Liek Allyandaru 123180054
 */
public class InputDataMahasiswa extends JFrame{
    // buat GUI
    JLabel lNim, lNama, lAlamat;
    JTextField tfNim, tfNama, tfAlamat;
    JButton bSimpan;
    JPanel panelForm, panelTombol;
    
    // buat Database
    String DBurl = "jdbc:mysql://localhost/praktikum";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    public InputDataMahasiswa(){
        // ritual awal
        setTitle("Coba Database :3");
        setSize(400,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        
        // buat ngasih label
        lNim = new JLabel("Nim");
        lNama = new JLabel("Nama");
        lAlamat = new JLabel("Alamat");
        
        // buat ngasih textfield
        tfNim = new JTextField(9);
        tfNama = new JTextField(50);
        tfAlamat = new JTextField(50);
        
        // buat ngasih button
        bSimpan = new JButton("Simpan");
        
        // buat ngasih panel
        panelForm = new JPanel(new GridLayout(5,2));
        panelTombol = new JPanel(new FlowLayout());
        
        setLayout(new BorderLayout());
        add(panelForm, BorderLayout.CENTER);
        panelForm.add(lNim);
        panelForm.add(tfNim);
        panelForm.add(lNama);
        panelForm.add(tfNama);
        panelForm.add(lAlamat);
        panelForm.add(tfAlamat);
        
        add(panelTombol, BorderLayout.SOUTH);
        panelTombol.add(bSimpan);
        
        bSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                masukkanData(); 
            }
        });
    }
    
    public void masukkanData(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl,DBusername,DBpassword);
            statement = koneksi.createStatement();
            
            statement.executeUpdate("INSERT INTO mahasiswa VALUES (' "+ tfNama.getText() + "','" + tfNim.getText() + "','"+ tfAlamat.getText() + "')");
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!", "Hasil",JOptionPane.INFORMATION_MESSAGE);            
            
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new InputDataMahasiswa();
    }
}