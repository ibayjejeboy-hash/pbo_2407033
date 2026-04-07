package latihan_pbo.latihan_4;

class Persegi extends BangunDatar {

    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }

    double hitungKeliling() {
        return 4 * sisi;
    }
}