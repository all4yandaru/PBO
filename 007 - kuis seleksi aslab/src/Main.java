import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                int pilih;

                System.out.println("\nMENU FORM PENDAFTARAN");
                System.out.println("1. Asisten Laboratorium");
                System.out.println("1. Admin Laboratorium");
                System.out.print("Pilih Jenis Form : ");

                pilih = input.nextInt();

                switch (pilih){
                    case 1:
                        pendaftaranAslab();
                        break;
                    case 2:
                        pendaftaranAdmin();
                        break;

                    default:
                        System.out.println("Opsi tidak ada");
                }
            }
            catch (NumberFormatException e){
                System.err.println(e.getMessage() + ", Opsi tidak ada");
            }
        }

    }

    private static void pendaftaranAslab() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\nFORM PENDAFTARAN ASISTEN LABORATORIUM");

            System.out.print("Berapa banyak data yang akan diinputkan : ");
            int banyakData = input.nextInt();

            for (int i=0; i<banyakData; i++){
                System.out.print("\nInput Nim : "); String nim = input.next();
                System.out.print("Input Nama : ");
                input = new Scanner(System.in); String nama = input.nextLine();

                System.out.print("Input Nilai Tes Tulis : "); float tulis = input.nextFloat();
                System.out.print("Input Nilai Tes Coding : "); float coding = input.nextFloat();
                System.out.print("Input Nilai Tes Wawancara : "); float wawancara = input.nextFloat();
                System.out.print("Input Nilai Tes Microteaching : "); float micro = input.nextFloat();

                Pendaftaran mahasiswa = new Pendaftaran(nama,nim,tulis,coding,wawancara,micro,"Aslab");
                mahasiswa.hasil();
            }
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    private static void pendaftaranAdmin() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\nFORM PENDAFTARAN ADMIN LABORATORIUM");

            System.out.print("Berapa banyak data yang akan diinputkan : ");
            int banyakData = input.nextInt();
            System.out.println();

            for (int i=0; i<banyakData; i++){
                System.out.print("Input Nim : "); String nim = input.next();
                System.out.print("Input Nama : ");
                input = new Scanner(System.in); String nama = input.nextLine();

                System.out.print("Input Nilai Tes Tulis : "); float tulis = input.nextFloat();
                System.out.print("Input Nilai Tes Coding : "); float coding = input.nextFloat();
                System.out.print("Input Nilai Tes Wawancara : "); float wawancara = input.nextFloat();
                System.out.print("Input Nilai Tes Praktek Jaringan : "); float jaringan = input.nextFloat();

                Pendaftaran mahasiswa = new Pendaftaran(nama,nim,tulis,coding,wawancara,jaringan,"Admin");
                mahasiswa.hasil();
            }
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
