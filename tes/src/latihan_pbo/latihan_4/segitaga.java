package latihan_pbo.latihan_4;

class Segitiga extends BangunDatar {

    double alas, tinggi, sisiA, sisiB, sisiC;

    Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}