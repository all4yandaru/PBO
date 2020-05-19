/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinjam;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Orenji
 */
public class PinjamView extends JFrame{
    JPanel Kiri = new JPanel();
    JPanel navKanan = new JPanel();
    
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btntampil = new JButton("Tampil");
    public JButton btnabout = new JButton("About Us");
    public JButton btntambah = new JButton("Tambah");
    public JButton btnbatal = new JButton("Batal");
    
    Font fontTitle = new Font("SanSerif", Font.PLAIN, 30);
    Font fontDesc = new Font("SanSerif", Font.PLAIN, 20);
    
    JLabel lidanggota = new JLabel("Id Anggota");
    JLabel lnama = new JLabel("Nama");
    JLabel lidbuku = new JLabel("Id Buku");
    JLabel ljudul = new JLabel("Judul Buku");
    
    public JTextField tfidanggota = new JTextField();
    public JTextField tfnama= new JTextField();
    public JTextField tfidbuku = new JTextField();
    public JTextField tfjudul = new JTextField();
    
    JLabel titlePerpus = new JLabel("Pinjam Buku");

    public PinjamView() {
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(null);
        setLocation(600,200);
        setResizable(false);
        setSize(700,500);
        
        // Adding panel=========================================================
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
        
        Kiri.add(lidanggota);
        lidanggota.setBounds(100,120,100,20);
        
        Kiri.add(lnama);
        lnama.setBounds(100,160,100,20);
        
        Kiri.add(lidbuku);
        lidbuku.setBounds(100,200,100,20);
        
        Kiri.add(ljudul);
        ljudul.setBounds(100,240,100,20);
        
        Kiri.add(tfidanggota);
        tfidanggota.setBounds(220,120,150,20);
        
        Kiri.add(tfnama);
        tfnama.setBounds(220,160,150,20);
        
        Kiri.add(tfidbuku);
        tfidbuku.setBounds(220,200,150,20);
        
        Kiri.add(tfjudul);
        tfjudul.setBounds(220,240,150,20);
        
        Kiri.add(btntambah);
        btntambah.setBounds(100,280,120,20);
        
        Kiri.add(btnbatal);
        btnbatal.setBounds(250,280,120,20);
        
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
    
    public String getIdAnggota(){
        return tfidanggota.getText();
    }
    
    public String getNama(){
        return tfnama.getText();
    }
    
    public String getIdBuku(){
        return tfidbuku.getText();
    }
    
    public String getJudul(){
        return tfjudul.getText();
    }
}
