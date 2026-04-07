package latihan_pbo.latihan_4;

abstract class BangunDatar {

    abstract double hitungLuas();
    abstract double hitungKeliling();

    public void tampilkanHasil() {
        System.out.printf("Luas       = %.2f\n", hitungLuas());
        System.out.printf("Keliling   = %.2f\n", hitungKeliling());
    }
}