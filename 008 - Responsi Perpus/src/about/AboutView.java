/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package about;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Orenji
 */
public class AboutView extends JFrame{
    public JPanel aboutKiri = new JPanel();
    
    Font fontTitle = new Font("SanSerif", Font.PLAIN, 30);
    Font fontDesc = new Font("SanSerif", Font.PLAIN, 20);
    
    JLabel titleAbout = new JLabel("About Us");
    JLabel descAbout = new JLabel("Ini adalah perpustakaan");
    
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btntampil = new JButton("Tampil");
    public JButton btnabout = new JButton("About Us");
    

    public AboutView() {
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(null);
        setLocation(600,200);
        setResizable(false);
        setSize(700,500);
        
        aboutKiri.setBounds(0,0,700,500);
        aboutKiri.setVisible(true);
        aboutKiri.setLayout(null);
        aboutKiri.setBackground(Color.yellow);
        add(aboutKiri);
        
        aboutKiri.add(titleAbout);
        titleAbout.setFont(fontTitle);
        titleAbout.setBounds(100,100,200,40);
        
        aboutKiri.add(descAbout);
        descAbout.setFont(fontDesc);
        descAbout.setBounds(100,150,400,30);
        
        aboutKiri.add(btnhome);
        btnhome.setBounds(100,250,100,20);
        
        aboutKiri.add(btnpinjam);
        btnpinjam.setBounds(100,290,100,20);
        
        aboutKiri.add(btntampil);
        btntampil.setBounds(100,330,100,20);
        
        aboutKiri.add(btnabout);
        btnabout.setBounds(100,370,100,20);
    }
}
