package latihan_pbo.latihan_5;


public class BangunRuang extends BangunDatar {
    private int tinggi;

    // constructor
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); // ambil dari parent
        this.tinggi = tinggi;
    }

    // method hitung volume
    public int hitungVolume() {
        return hitungLuas() * tinggi; // pakai method dari parent
    }
}