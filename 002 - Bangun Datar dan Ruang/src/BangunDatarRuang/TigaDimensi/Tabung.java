package BangunDatarRuang.TigaDimensi;

import BangunDatarRuang.DuaDimensi.Lingkaran;

public class Tabung extends Lingkaran {
    private double tinggi;

    public Tabung(double tinggi) {
        this.tinggi = tinggi;
    }

    public Tabung() {
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        super.luas = 2*super.luas + super.keliling*tinggi;
        return super.luas;
    }

    public double hitungVolume(){
        super.volume = super.luas*tinggi;
        return super.volume;
    }

    @Override
    public void display() {
        this.hitung();
        System.out.println("Tabung : ");
        System.out.printf("Volume = %.2f\n",super.volume);
        System.out.printf("Luas Permukaan = %.2f\n\n",super.luas);
        super.hitungLuas();
    }

    @Override
    public void hitung() {
        this.hitungVolume();
        this.hitungLuas();
    }
}
