package BangunDatarRuang.DuaDimensi;

import BangunDatarRuang.Bangun;

public class Lingkaran extends Bangun {
    protected static double diameter;

    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    public Lingkaran() {
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double hitungLuas() {
        super.luas = super.pi*diameter*diameter/4;
        return super.luas;
    }

    @Override
    public double hitungKeliling() {
        super.keliling = super.pi*diameter;
        return super.keliling;
    }

    @Override
    public void display() {
        this.hitung();
        System.out.println("Lingkaran : ");
        System.out.printf("Luas = %.2f\n",super.luas);
        System.out.printf("Keliling = %.2f\n\n",super.keliling);
    }

    @Override
    public void hitung() {
        hitungKeliling();
        hitungLuas();
    }
}
