package latihan_pbo.latihan_5;


public class Main {
    public static void main(String[] args) {

        // input data
        BangunRuang br = new BangunRuang(10, 5, 4);

        // output
        System.out.println("Luas Alas: " + br.hitungLuas());
        System.out.println("Volume: " + br.hitungVolume());
    }
}