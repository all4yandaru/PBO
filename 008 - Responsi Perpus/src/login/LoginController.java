/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import home.HomeMVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Orenji
 */
public class LoginController {
    LoginView lv;

    public LoginController(LoginView lv) {
        this.lv = lv;
        
        lv.btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String username, password;
                    username = lv.getUsername();
                    password = lv.getPassword();

                    if (username.equals("admin") && password.equals("admin")) {
                        JOptionPane.showMessageDialog(null, "Login Sukses");
                        lv.setVisible(false);
                        HomeMVC hmvc = new HomeMVC();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Login Gagal");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        });
        
        
        lv.btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
    }
}
