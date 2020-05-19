/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import about.AboutMVC;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Orenji
 */
public class HomeView extends JFrame{
    JPanel homeKiri = new JPanel();
    JPanel navKanan = new JPanel();
    
    JButton btnhome = new JButton("Home");
    JButton btnpinjam = new JButton("Pinjam");
    JButton btntampil = new JButton("Tampil");
    JButton btnabout = new JButton("About Us");
    
    Font fontTitle = new Font("SanSerif", Font.PLAIN, 30);
    Font fontDesc = new Font("SanSerif", Font.PLAIN, 20);
    
    JLabel titlePerpus = new JLabel("Perpustakaan");
    JLabel descWelcome = new JLabel("Selamat Datang");
    JLabel descPerpus = new JLabel("di Perpustakaan");

    public HomeView() {
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(null);
        setLocation(600,200);
        setResizable(false);
        setSize(700,500);
        
        homeKiri.setBounds(0,0,495,500);
        homeKiri.setVisible(true);
        homeKiri.setLayout(null);
        homeKiri.setBackground(Color.yellow);
        add(homeKiri);
        
        navKanan.setBounds(505,0,200,500);
        navKanan.setVisible(true);
        navKanan.setLayout(null);
        navKanan.setBackground(Color.yellow);
        add(navKanan);
        
        
        homeKiri.add(titlePerpus);
        titlePerpus.setFont(fontTitle);
        titlePerpus.setBounds(150,50,200,40);
        
        homeKiri.add(descWelcome);
        descWelcome.setFont(fontDesc);
        descWelcome.setBounds(165,150,200,40);
        
        homeKiri.add(descPerpus);
        descPerpus.setFont(fontDesc);
        descPerpus.setBounds(165,200,200,40);
        
        navKanan.add(btnhome);
        btnhome.setBounds(50,150,100,20);
        
        navKanan.add(btnpinjam);
        btnpinjam.setBounds(50,190,100,20);
        
        navKanan.add(btntampil);
        btntampil.setBounds(50,230,100,20);
        
        navKanan.add(btnabout);
        btnabout.setBounds(50,270,100,20);
    }
}
