package BangunDatarRuang.TigaDimensi;

import BangunDatarRuang.DuaDimensi.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {
    private double tinggi;

    public LimasPersegiPanjang(double tinggi) {
        this.tinggi = tinggi;
    }

    public LimasPersegiPanjang() {
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double sisiMiringPanjang(){
        return Math.sqrt(Math.pow(lebar/2,2) + Math.pow(tinggi,2));
    }

    private double sisiMiringLebar(){
        return Math.sqrt(Math.pow(panjang/2,2) + Math.pow(tinggi,2));
    }

    @Override
    public double hitungLuas() {
        super.luas = super.luas + 2*(panjang*sisiMiringPanjang()/2) + 2*(lebar*sisiMiringLebar()/2);
        return super.luas;
    }

    public double hitungVolume(){
        super.volume = super.luas*tinggi/3;
        return super.volume;
    }

    @Override
    public void display() {
        this.hitung();
        System.out.println("Limas Persegi Panjang : ");
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
