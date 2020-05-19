/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

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
public class LoginView extends JFrame{

    JPanel pane = new JPanel();
    JLabel ltitle = new JLabel("Login Ea");
    
    JLabel lusername = new JLabel("Username");
    JLabel lpassword = new JLabel("Password");
    
    JTextField tfusername = new JTextField();
    JTextField tfpassword = new JTextField();
    
    JButton btnlogin = new JButton("Login");
    JButton btnexit = new JButton("exit");
    
    Font fontTitle = new Font("SanSerif", Font.PLAIN, 40);
    
    public LoginView() {
        setDefaultCloseOperation(3);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setLocation(600,200);
        setSize(450,500);
        
        pane.setBounds(0,0,450,525);
        pane.setVisible(true);
        pane.setLayout(null);
        pane.setBackground(Color.yellow);
        add(pane);
        
        pane.add(ltitle);
        ltitle.setFont(fontTitle);
        ltitle.setBounds(140,50,200,50);
        
        pane.add(lusername);
        lusername.setBounds(100,150,100,20);
        
        pane.add(tfusername);
        tfusername.setBounds(200,150,120,20);
        
        pane.add(lpassword);
        lpassword.setBounds(100,210,100,20);
        
        pane.add(tfpassword);
        tfpassword.setBounds(200,210,120,20);
        
        pane.add(btnlogin);
        btnlogin.setBounds(100,270,100,20);
        
        pane.add(btnexit);
        btnexit.setBackground(Color.red);
        btnexit.setBounds(220,270,100,20);
        
        // frame.setBackground(Color.yellow);
    }
    
    public String getUsername(){
        return tfusername.getText();
    }
    
    public String getPassword(){
        return tfpassword.getText();
    }
}
