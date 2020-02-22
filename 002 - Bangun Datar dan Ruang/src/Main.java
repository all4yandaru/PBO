import BangunDatarRuang.DuaDimensi.*;
import BangunDatarRuang.TigaDimensi.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ulang, data_baru;
        boolean init = true;
        float panjang = 0, lebar = 0, tinggi = 0;
        int pilih;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        ;
        Lingkaran lingkaran = new Lingkaran();
        Balok balok = new Balok();
        LimasPersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();

        do {
            if (!init) {
                System.out.print("Ingin memasukkan data baru? (y/n) ");
                data_baru = input.next();
                init = data_baru.equalsIgnoreCase("y");
            }

            if (init) {
                System.out.print("Masukkan Panjang\t: ");
                panjang = input.nextFloat();
                System.out.print("Masukkan Lebar\t\t: ");
                lebar = input.nextFloat();
                System.out.print("Masukkan Tinggi\t\t: ");
                tinggi = input.nextFloat();

                persegiPanjang = new PersegiPanjang(panjang, lebar);
                lingkaran = new Lingkaran(lebar);

                balok = new Balok(tinggi);
                limasPersegiPanjang = new LimasPersegiPanjang(tinggi);

                tabung = new Tabung(tinggi);
                kerucut = new Kerucut(tinggi);
                init = false;
            }

            System.out.println("\nHitung :");
            System.out.println("1. Persegi");
            System.out.println("2. Balok");
            System.out.println("3. Limas Persegi Panjang");
            System.out.println("4. Lingkaran");
            System.out.println("5. Tabung");
            System.out.println("6. Kerucut");

            System.out.print("Pilih : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Persegi Panjang : ");
                    System.out.println("\nConstructor dengan parameter =====");
                    persegiPanjang.hitung();
                    persegiPanjang.display();

                    System.out.println("Constructor tanpa parameter =====");
                    persegiPanjang = new PersegiPanjang();
                    persegiPanjang.setPanjang(panjang);
                    persegiPanjang.setLebar(lebar);
                    persegiPanjang.display();
                    break;

                case 2:
                    System.out.println("Balok : ");
                    System.out.println("\nConstructor dengan parameter =====");
                    persegiPanjang.hitung();
                    balok.display();

                    System.out.println("Constructor tanpa parameter =====");
                    balok = new Balok();
                    balok.setTinggi(tinggi);
                    balok.display();
                    break;

                case 3:
                    System.out.println("Limas Persegi Panjang : ");
                    System.out.println("\nConstructor dengan parameter =====");
                    persegiPanjang.hitung();
                    limasPersegiPanjang.display();

                    System.out.println("Constructor tanpa parameter =====");
                    limasPersegiPanjang = new LimasPersegiPanjang();
                    limasPersegiPanjang.setTinggi(tinggi);
                    limasPersegiPanjang.display();
                    break;

                case 4:
                    System.out.println("Lingkaran : ");
                    System.out.println("\nConstructor dengan parameter =====");
                    lingkaran.hitung();
                    lingkaran.display();

                    System.out.println("Constructor tanpa parameter =====");
                    lingkaran = new Lingkaran();
                    lingkaran.setDiameter(lebar);
                    lingkaran.display();
                    break;

                case 5:
                    System.out.println("Tabung : ");
                    System.out.println("\nConstructor dengan parameter =====");
                    lingkaran.hitung();
                    tabung.display();

                    System.out.println("Constructor tanpa parameter =====");
                    tabung = new Tabung();
                    tabung.setTinggi(tinggi);
                    tabung.display();
                    break;

                case 6:
                    System.out.println("Kerucut : ");
                    System.out.println("\nConstructor dengan parameter =====");
                    lingkaran.hitung();
                    kerucut.display();

                    System.out.println("Constructor tanpa parameter =====");
                    kerucut = new Kerucut();
                    kerucut.setTinggi(tinggi);
                    kerucut.display();
                    break;

                default:
                    System.out.println("Input Salah!");
            }


            System.out.print("Ulangi proses ? (y/n) ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("y"));


        System.out.println("\nTERIMA KASIH :)");

    }
}
