public class Perlengkapan {

    // Atribut
    public String namaAlat;
    public double berat;
    public String kondisi;

    // Constructor default
    public Perlengkapan() {
        this.namaAlat = "Carrier";
        this.berat    = 5.0;
        this.kondisi  = "Baik";
    }

    // Constructor dengan parameter
    public Perlengkapan(String namaAlat, double berat, String kondisi) {
        this.namaAlat = namaAlat;
        this.berat    = berat;
        this.kondisi  = kondisi;
    }

    // Getter
    public String getNamaAlat() {
        return namaAlat;
    }

    // Behaviour: menampilkan info alat
    public String infoAlat() {
        return namaAlat + " | Berat: " + berat + " kg | Kondisi: " + kondisi;
    }
}
