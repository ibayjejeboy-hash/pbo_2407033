package latihan_pbo.latihan_5;

public class BangunDatar {
    // atribut (enkapsulasi)
    private int panjang;
    private int lebar;

    // constructor
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method hitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }

    // getter (optional tapi bagus untuk OOP)
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
}