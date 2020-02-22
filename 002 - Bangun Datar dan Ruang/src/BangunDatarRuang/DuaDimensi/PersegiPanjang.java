package BangunDatarRuang.DuaDimensi;

import BangunDatarRuang.Bangun;

public class PersegiPanjang extends Bangun {
    protected static double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public PersegiPanjang() {
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        super.luas = panjang*lebar;
        return super.luas;
    }

    @Override
    public double hitungKeliling() {
        super.keliling = 2*(panjang+lebar);
        return super.keliling;
    }

    @Override
    public void display() {
        this.hitung();
        System.out.println("Persegi Panjang : ");
        System.out.printf("Luas = %.2f\n",super.luas);
        System.out.printf("Keliling = %.2f\n\n",super.keliling);
    }

    @Override
    public void hitung() {
        hitungKeliling();
        hitungLuas();
    }
}
