package latihan_pbo.tugas_2407033;

import java.util.Scanner;

public class KalkulatorBangunDatar {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;
        char ulang;

        do {
            System.out.println("\n=================================");
            System.out.println("   KALKULATOR BANGUN DATAR PRO  ");
            System.out.println("=================================");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Pilih bangun datar (1-5): ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungPersegi();
                    break;
                case 2:
                    hitungPersegiPanjang();
                    break;
                case 3:
                    hitungSegitiga();
                    break;
                case 4:
                    hitungLingkaran();
                    break;
                case 5:
                    System.out.println("Terima kasih sudah menggunakan program ini");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

            System.out.print("\nHitung lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');
    }

    // ================= VALIDASI INPUT =================
    static double inputPositif(String pesan) {
        double nilai;
        do {
            System.out.print(pesan);
            nilai = input.nextDouble();
            if (nilai <= 0) {
                System.out.println("Nilai harus lebih dari 0!");
            }
        } while (nilai <= 0);
        return nilai;
    }

    // ================= PERSEGI =================
    static void hitungPersegi() {
        double sisi = inputPositif("Masukkan sisi: ");

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("\n=== HASIL PERSEGI ===");
        System.out.printf("Luas       = %.2f\n", luas);
        System.out.printf("Keliling   = %.2f\n", keliling);
    }

    // ================= PERSEGI PANJANG =================
    static void hitungPersegiPanjang() {
        double p = inputPositif("Masukkan panjang: ");
        double l = inputPositif("Masukkan lebar: ");

        double luas = p * l;
        double keliling = 2 * (p + l);

        System.out.println("\n=== HASIL PERSEGI PANJANG ===");
        System.out.printf("Luas       = %.2f\n", luas);
        System.out.printf("Keliling   = %.2f\n", keliling);
    }

    // ================= SEGITIGA =================
    static void hitungSegitiga() {
        double alas = inputPositif("Masukkan alas: ");
        double tinggi = inputPositif("Masukkan tinggi: ");
        double sisiA = inputPositif("Masukkan sisi A: ");
        double sisiB = inputPositif("Masukkan sisi B: ");
        double sisiC = inputPositif("Masukkan sisi C: ");

        double luas = 0.5 * alas * tinggi;
        double keliling = sisiA + sisiB + sisiC;

        System.out.println("\n=== HASIL SEGITIGA ===");
        System.out.printf("Luas       = %.2f\n", luas);
        System.out.printf("Keliling   = %.2f\n", keliling);
    }

    // ================= LINGKARAN =================
    static void hitungLingkaran() {
        double r = inputPositif("Masukkan jari-jari: ");

        double luas = Math.PI * r * r;
        double keliling = 2 * Math.PI * r;

        System.out.println("\n=== HASIL LINGKARAN ===");
        System.out.printf("Luas       = %.2f\n", luas);
        System.out.printf("Keliling   = %.2f\n", keliling);
    }
}