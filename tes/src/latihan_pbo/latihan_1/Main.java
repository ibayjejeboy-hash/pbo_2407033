package latihan_pbo.latihan_1;
class Cafe {
    String nama;
    String alamat;

    // Konstruktor default
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Nama cafenya adalah: " + nama);
        System.out.println("alamatnya di: " + alamat);
    }
    //metode lain bisa ditambahkan di sini
    void buka() {
        System.out.println("Cafe " + this.nama + " sedang buka.");
    }
}
public class Main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Kopi Kenangan", "Jl. Merdeka No. 10");
        // cafe1.nama = "Kopi Kenangan";
        // cafe1.alamat = "Jl. Merdeka No. 10";

         Cafe cafe2 = new Cafe("Starbucks", "Jl. Sudirman No. 20");
        // cafe2.nama = "Starbucks";
        // cafe2.alamat = "Jl. Sudirman No. 20";

        Cafe cafe3 = new Cafe("Janji Jiwa", "Jl. Diponegoro No. 5");
        // cafe3.nama = "Janji Jiwa";
        // cafe3.alamat = "Jl. Diponegoro No. 5";

        // System.out.println("Cafe 1:");
        // System.out.println("Nama: " + cafe1.nama);
        // System.out.println("Alamat: " + cafe1.alamat);

        // System.out.println("\nCafe 2:");
        // System.out.println("Nama: " + cafe2.nama);
        // System.out.println("Alamat: " + cafe2.alamat);

        // System.out.println("\nCafe 3:");
        // System.out.println("Nama: " + cafe3.nama);
        // System.out.println("Alamat: " + cafe3.alamat);
    }   
}