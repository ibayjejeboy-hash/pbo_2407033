
package latihan_pbo.latihan_2;

// //enkapsulasi
// //access modifier: public, private, protected, default


// class PersegiPanjang {
//     private int panjang;
//     private int lebar;

//     // Konstruktor
//     public PersegiPanjang(int panjang, int lebar) {
//         this.panjang = panjang;
//         this.lebar = lebar;
//     }

//     // Getter untuk panjang
//     public int getPanjang() {
//         return panjang;
//     }

//     // Setter untuk panjang
//     public void setPanjang(int panjang) {
//         this.panjang = panjang;
//     }

//     // Getter untuk lebar
//     public int getLebar() {
//         return lebar;
//     }

//     // Setter untuk lebar
//     public void setLebar(int lebar) {
//         this.lebar = lebar;
//     }

//     // Metode untuk menghitung luas
//     public int hitungLuas() {
//         return panjang * lebar;
//     }
// }




// // Class Persegi (Enkapsulasi)
// class Persegi {
//     private int panjang;
//     private int lebar;

//     // Method untuk menampilkan pesan pembuka
//     void tampil() {
//         System.out.println("=== Menghitung Persegi ===");
//     }

//     // Setter untuk Panjang
//     public void setPanjang(int panjang) {
//         this.panjang = panjang;
//     }

//     // Getter untuk Panjang
//     public int getPanjang() {
//         return panjang;
//     }

//     // Setter untuk Lebar
//     public void setLebar(int lebar) {
//         this.lebar = lebar;
//     }

//     // Getter untuk Lebar
//     public int getLebar() {
//         return lebar;
//     }

//     // Bonus: Method hitung luas
//     public int hitungLuas() {
//         return panjang * lebar;
//     }
// }

// // Class Utama
// public class main {
//     public static void main(String[] args) {
//         Persegi persegi1 = new Persegi();
        
//         // Memasukkan nilai angka (tanpa tanda petik)
//         persegi1.setPanjang(9);
//         persegi1.setLebar(10 );
        
//         persegi1.tampil();
//         System.out.println("Panjang : " + persegi1.getPanjang());
//         System.out.println("Lebar   : " + persegi1.getLebar());
//         System.out.println("Luas    : " + persegi1.hitungLuas());
//     }
// }



class Persegi {
    private int panjang;
    private int lebar;

    void tampil() {
        System.out.println("=== Menghitung Persegi ===");
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    // Tambahan Method Keliling
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();

        persegi1.setPanjang(9);
        persegi1.setLebar(10);

        persegi1.tampil();
        System.out.println("Panjang   : " + persegi1.getPanjang());
        System.out.println("Lebar     : " + persegi1.getLebar());
        System.out.println("Luas      : " + persegi1.hitungLuas());
        System.out.println("Keliling  : " + persegi1.hitungKeliling());
    }
}
