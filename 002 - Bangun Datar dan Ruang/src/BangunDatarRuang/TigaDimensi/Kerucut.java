package BangunDatarRuang.TigaDimensi;

import BangunDatarRuang.DuaDimensi.Lingkaran;

public class Kerucut extends Lingkaran {
    private double tinggi;

    public Kerucut(double tinggi) {
        this.tinggi = tinggi;
    }

    public Kerucut() {
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double sisiMiring(){
        return Math.sqrt(Math.pow(diameter/2,2) + Math.pow(tinggi,2));
    }

    @Override
    public double hitungLuas() {
        super.luas = super.luas + pi*diameter*sisiMiring()/2;
        return super.luas;
    }

    public double hitungVolume(){
        super.volume = super.luas*tinggi/3;
        return super.volume;
    }

    @Override
    public void display() {
        this.hitung();
        System.out.println("Kerucut : ");
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
