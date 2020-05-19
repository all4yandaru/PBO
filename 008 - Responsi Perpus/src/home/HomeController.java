/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import Data.DataPerpus;
import about.AboutView;
import editdelete.EditdeleteMVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import pinjam.PinjamView;
import tampil.TampilView;

/**
 *
 * @author Orenji
 */
public class HomeController {
    HomeView hv;
    AboutView av;
    PinjamView pv;
    public TampilView tv;
    HomeModel hm;

    public HomeController(HomeView hv, AboutView av, PinjamView pv, TampilView tv, HomeModel hm) {
        this.hv = hv;
        this.av = av;
        this.pv = pv;
        this.tv = tv;
        this.hm = hm;
        
        semuaFalse();
        hv.setVisible(true);
        
        
        // HOME======================================================================================================================
        hv.btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                hv.setVisible(true);
            }
        });
        
        hv.btnpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                pv.setVisible(true);
            }
        });
        
        hv.btntampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                tv.setVisible(true);
                tampil();
            }
        });
        
        hv.btnabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                av.setVisible(true);
            }
        });
        
        
        // About==============================================================================================================
        av.btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                hv.setVisible(true);
            }
        });
        
        av.btnpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                pv.setVisible(true);
            }
        });
        
        av.btntampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                tv.setVisible(true);
                tampil();
            }
        });
        
        av.btnabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                av.setVisible(true);
            }
        });
        
        
        // Pinjam ===============================================================================
        pv.btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                hv.setVisible(true);
            }
        });
        
        pv.btnpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                pv.setVisible(true);
            }
        });
        
        pv.btntambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String idanggota = pv.getIdAnggota(),
                        nama = pv.getNama(),
                        idbuku = pv.getIdBuku(),
                        judul = pv.getJudul();
                
                if (idanggota.equals("") || nama.equals("") || idbuku.equals("") || judul.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
                }
                else {
                    hm.TambahData(idanggota, nama, idbuku, judul);
                    pv.tfidanggota.setText("");
                    pv.tfnama.setText("");
                    pv.tfidbuku.setText("");
                    pv.tfjudul.setText("");
                }
            }
        });
        
        pv.btnbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pv.tfidanggota.setText("");
                pv.tfnama.setText("");
                pv.tfidbuku.setText("");
                pv.tfjudul.setText("");
            }
        });
        
        pv.btntampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                tv.setVisible(true);
                tampil();
            }
        });
        
        pv.btnabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                av.setVisible(true);
            }
        });
        
        
        // Tampil =========================================================================
        tv.btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                hv.setVisible(true);
            }
        });
        
        tv.btnpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                pv.setVisible(true);
            }
        });
        
        tv.btntampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                tv.setVisible(true);
                tampil();
            }
        });
        
        tv.btnabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                semuaFalse();
                av.setVisible(true);
            }
        });
        
        tv.btncari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cari = tv.getCari();
                
                if (cari.equals("")) {
                    tampil();
                }
                else {
                    String[][] data = hm.Cari(cari);
                    tv.tabel.setModel(new JTable(data, tv.kolom).getModel());
                }
            }
        });
        
        tv.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                super.mouseClicked(me);
                int baris = tv.tabel.getSelectedRow();
                String id = tv.tabel.getValueAt(baris, 0).toString();
                String id_anggota = tv.tabel.getValueAt(baris, 1).toString();
                String nama = tv.tabel.getValueAt(baris, 2).toString();
                String id_buku = tv.tabel.getValueAt(baris, 3).toString();
                String judul = tv.tabel.getValueAt(baris, 4).toString();
                System.out.println(id + " " + id_anggota + " " + nama + " " + id_buku + " " + judul);
                DataPerpus dp = new DataPerpus(id, id_anggota, nama, id_buku, judul);
                
                tv.setVisible(false);
                EditdeleteMVC emvc = new EditdeleteMVC(dp);
            }
        });
    }
    
    void semuaFalse(){
        av.setVisible(false);
        hv.setVisible(false);
        pv.setVisible(false);
        tv.setVisible(false);
    }
    
    public void tampil(){
        if (hm.BanyakData()!=0) {
            String[][] data = hm.TampilData();
            tv.tabel.setModel(new JTable(data, tv.kolom).getModel());
        }
    }
}
