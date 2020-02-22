package BangunDatarRuang.TigaDimensi;

import BangunDatarRuang.DuaDimensi.PersegiPanjang;

public class Balok extends PersegiPanjang {
    private double tinggi;

    public Balok(double tinggi) {
        this.tinggi = tinggi;
    }

    public Balok() {
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
        System.out.println("Balok : ");
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
