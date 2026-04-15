package latihan_pbo.latihan_5;

public class BangunDatar {
    
    private int panjang;
    private int lebar;

   
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    
    public int hitungLuas() {
        return panjang * lebar * 2;
    }

    
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
}