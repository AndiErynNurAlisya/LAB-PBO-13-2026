public class Pendaki {

    // Atribut
    public String       nama;
    public int          stamina;
    public Perlengkapan perlengkapan; // objek dari class lain
    public Gunung       gunung;       // objek dari class lain

    // Constructor default
    public Pendaki() {
        this.nama         = "Pendaki Baru";
        this.stamina      = 100;
        this.perlengkapan = new Perlengkapan();
        this.gunung       = new Gunung();
    }

    // Constructor dengan parameter
    public Pendaki(String nama, int stamina, Perlengkapan perlengkapan, Gunung gunung) {
        this.nama         = nama;
        this.stamina      = stamina;
        this.perlengkapan = perlengkapan;
        this.gunung       = gunung;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    // Behaviour 1: mendaki bersama teman (interaksi antar objek Pendaki yang sama)
    public void mendaki(Pendaki teman) {
        System.out.println("\n=== PENDAKIAN DIMULAI ===");
        System.out.println(this.nama + " dan " + teman.nama + " mendaki bersama.");
        System.out.println("Tujuan: " + this.gunung.getNamaGunung());

        // Stamina berkurang sesuai ketinggian gunung
        int beban = this.gunung.ketinggian / 100;
        this.stamina  -= beban;
        teman.stamina -= beban;

        System.out.println(this.nama  + " stamina tersisa: " + this.stamina);
        System.out.println(teman.nama + " stamina tersisa: " + teman.stamina);

        // Cek siapa yang kelelahan
        if (this.stamina <= 0) {
            System.out.println(this.nama + " kelelahan dan harus turun!");
        } else if (teman.stamina <= 0) {
            System.out.println(teman.nama + " kelelahan dan harus turun!");
        } else {
            System.out.println("Keduanya berhasil mencapai puncak! Selamat!");
        }
    }

    // Behaviour 2: cek kondisi pendaki (berinteraksi dengan objek perlengkapan & gunung)
    public void cekKondisi() {
        System.out.println("========================================");
        System.out.println("  Nama        : " + nama);
        System.out.println("  Stamina     : " + stamina);
        System.out.println("  Perlengkapan: " + perlengkapan.infoAlat()); // akses objek perlengkapan
        System.out.println("  Tujuan      : " + gunung.infoGunung());     // akses objek gunung
        System.out.println("========================================");
    }
}
