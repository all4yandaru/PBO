package Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Orenji
 */
public class DataPerpus implements Data{
    private String id;
    private String id_anggota;
    private String nama;
    private String id_buku;
    private String judul;

    public DataPerpus(String id, String id_anggota, String nama, String id_buku, String judul) {
        this.id = id;
        this.id_anggota = id_anggota;
        this.nama = nama;
        this.id_buku = id_buku;
        this.judul = judul;
    }
    
    @Override
    public String[] getAllData() {
        String[] data = new String[5];
        data[0] = getId();
        data[1] = getId_anggota();
        data[2] = getNama();
        data[3] = getId_buku();
        data[4] = getJudul();
        return data;
    }

    public String getId() {
        return id;
    }

    public String getId_anggota() {
        return id_anggota;
    }

    public String getNama() {
        return nama;
    }

    public String getId_buku() {
        return id_buku;
    }

    public String getJudul() {
        return judul;
    }
    
}
