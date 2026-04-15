package latihan_pbo.latihan_5;


public class BangunRuang extends BangunDatar {
    private int tinggi;

    
 public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); 
        this.tinggi = tinggi;
    }

    @Override

     public int hitungLuas() {
        return getPanjang() * getLebar() * 2;
    }

    public int hitungVolume() {
        return hitungLuas() * tinggi; 
    }

    
}