package BangunDatarRuang;

public abstract class Bangun {
    public static double luas, keliling, volume;
    public static final double pi = 3.14159265359;
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    public abstract void display();
    public abstract void hitung();
}
