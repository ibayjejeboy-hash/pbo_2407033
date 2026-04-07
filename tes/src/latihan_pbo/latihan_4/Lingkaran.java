package latihan_pbo.latihan_4;

class Lingkaran extends BangunDatar {

    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    double hitungLuas() {
        return Math.PI * r * r;
    }

    double hitungKeliling() {
        return 2 * Math.PI * r;
    }
}