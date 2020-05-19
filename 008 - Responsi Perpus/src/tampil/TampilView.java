/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampil;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orenji
 */
public class TampilView extends JFrame{
    JPanel Kiri = new JPanel();
    JPanel navKanan = new JPanel();
    
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btntampil = new JButton("Tampil");
    public JButton btnabout = new JButton("About Us");
    public JButton btncari = new JButton("Cari");
    
    public JTextField tfcari = new JTextField();
    
    Font fontTitle = new Font("SanSerif", Font.PLAIN, 30);
    Font fontDesc = new Font("SanSerif", Font.PLAIN, 20);
    
    public JTable tabel;
    public Object[] kolom = {"id","ID Anggota","Nama","ID Buku","Judul Buku"};
    DefaultTableModel model;
    JScrollPane pane;
    
    JLabel titlePerpus = new JLabel("List Pinjaman");

    public TampilView() {
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(null);
        setLocation(600,200);
        setResizable(false);
        setSize(700,500);
        
        Kiri.setBounds(0,0,495,500);
        Kiri.setVisible(true);
        Kiri.setLayout(null);
        Kiri.setBackground(Color.yellow);
        add(Kiri);
        
        navKanan.setBounds(505,0,200,500);
        navKanan.setVisible(true);
        navKanan.setLayout(null);
        navKanan.setBackground(Color.yellow);
        add(navKanan);
        
        // Adding attributes=====================================================
        // Kiri ===================================================================
        Kiri.add(titlePerpus);
        titlePerpus.setFont(fontTitle);
        titlePerpus.setBounds(150,50,200,40);
        
        Kiri.add(btncari);
        btncari.setBounds(390,120,100,20);
        
        Kiri.add(tfcari);
        tfcari.setBounds(230,120,150,20);
        
        model = new DefaultTableModel(kolom,0);
        tabel = new JTable(model);
        pane = new JScrollPane(tabel);

        tabel.setModel(model);
        Font font = new Font("",1,16);
        tabel.setFont(font);
        tabel.setRowHeight(30);
        pane.setBounds(5, 150, 485, 310);
        Kiri.add(pane);
        
        // Kanan===================================================================
        navKanan.add(btnhome);
        btnhome.setBounds(50,150,100,20);
        
        navKanan.add(btnpinjam);
        btnpinjam.setBounds(50,190,100,20);
        
        navKanan.add(btntampil);
        btntampil.setBounds(50,230,100,20);
        
        navKanan.add(btnabout);
        btnabout.setBounds(50,270,100,20);
    }
    
    public String getCari(){
        return tfcari.getText();
    }
}
