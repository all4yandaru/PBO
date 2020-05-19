/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editdelete;

import Data.DataPerpus;
import home.HomeMVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Orenji
 */
public class EditdeleteController {
    EditdeleteView ev;
    EditdeleteModel em;
    DataPerpus dp;

    public EditdeleteController(EditdeleteView ev, EditdeleteModel em, DataPerpus dp) {
        this.ev = ev;
        this.em = em;
        this.dp = dp;
        
        ev.tfidanggota.setText(dp.getId_anggota());
        ev.tfnama.setText(dp.getNama());
        ev.tfidbuku.setText(dp.getId_buku());
        ev.ljudul2.setText(dp.getJudul());
        
        ev.btnupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String[] allData = dp.getAllData();
                
                String id = dp.getId();
                String idanggota = ev.tfidanggota.getText();
                String nama = ev.tfnama.getText();
                String idbuku = ev.tfidbuku.getText();
                String judul = dp.getJudul();
                
                if (nama.equals("") || idbuku.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
                }
                else {
                    em.update(id, nama, idbuku);
                    HomeMVC hmvc = new HomeMVC();
                    hmvc.homeView.setVisible(false);
                    hmvc.controller.tampil();
                    hmvc.controller.tv.setVisible(true);
                    ev.setVisible(false);
                }
            }
        });
        
        ev.btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String id = dp.getId();
                String idanggota = ev.tfidanggota.getText();
                String nama = ev.tfnama.getText();
                String idbuku = ev.tfidbuku.getText();
                String judul = dp.getJudul();
                
                em.delete(id);
                HomeMVC hmvc = new HomeMVC();
                hmvc.homeView.setVisible(false);
                hmvc.controller.tampil();
                hmvc.controller.tv.setVisible(true);
                ev.setVisible(false);
            }
        });
        
        ev.btncancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                HomeMVC hmvc = new HomeMVC();
                hmvc.homeView.setVisible(false);
                hmvc.controller.tampil();
                hmvc.controller.tv.setVisible(true);
                ev.setVisible(false);
            }
        });
    }
}
