/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editdelete;

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
public class EditdeleteView extends JFrame{
    JPanel Kiri = new JPanel();
    
    public JButton btnupdate = new JButton("Edit");
    public JButton btndelete = new JButton("Delete");
    
    public JButton btncancel = new JButton("Cancel");
    
    Font fontTitle = new Font("SanSerif", Font.PLAIN, 30);
    Font fontDesc = new Font("SanSerif", Font.PLAIN, 20);
    
    JLabel lidanggota = new JLabel("Id Anggota");
    JLabel lnama = new JLabel("Nama");
    JLabel lidbuku = new JLabel("Id Buku");
    JLabel ljudul = new JLabel("Judul Buku");
    
    JLabel titlePerpus = new JLabel("Edit & Delete");
    
    public JTextField tfidanggota = new JTextField();
    public JTextField tfnama= new JTextField();
    public JTextField tfidbuku = new JTextField();
    public JLabel ljudul2 = new JLabel();

    public EditdeleteView() {
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(null);
        setLocation(600,200);
        setResizable(false);
        setSize(500,500);
        
        Kiri.setBounds(0,0,500,500);
        Kiri.setVisible(true);
        Kiri.setLayout(null);
        Kiri.setBackground(Color.yellow);
        add(Kiri);
        
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
        tfidanggota.setEditable(false);
        
        Kiri.add(tfnama);
        tfnama.setBounds(220,160,150,20);
        
        Kiri.add(tfidbuku);
        tfidbuku.setBounds(220,200,150,20);
        
        Kiri.add(ljudul2);
        ljudul2.setBounds(220,240,150,20);
        
        Kiri.add(btnupdate);
        btnupdate.setBounds(100,280,120,20);
        
        Kiri.add(btndelete);
        btndelete.setBounds(250,280,120,20);
        
        Kiri.add(btncancel);
        btncancel.setBounds(100,320,120,20);
    }
}
