public class Pendaftaran extends Mahasiswa implements Seleksi {
    private float tulis, coding, wawancara, microOrJaringan;
    String pilihan;

    public Pendaftaran(String nama, String nim, float tulis, float coding, float wawancara, float microOrJaringan, String pilihan) {
        super(nama, nim);
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
        this.microOrJaringan = microOrJaringan;
        this.pilihan = pilihan;
    }

    @Override
    public float hitungRataRata() {
        return (tulis + coding + wawancara + microOrJaringan)/4;
    }

    @Override
    public void hasil() {
        float hasil = hitungRataRata();

        System.out.printf("Nilai Akhir : %.1f\n", hasil);
        if (hasil > 85){
            System.out.println("KETERANGAN : LOLOS\nSelamat kepada " + super.getNim() + " telah diterima sebagai " + pilihan + "\n");
        } else {
            System.out.println("KETERANGAN : GAGAL\nMohon maaf kepada " + super.getNim() + " telah ditolak sebagai " + pilihan + "\n");
        }
    }
}
