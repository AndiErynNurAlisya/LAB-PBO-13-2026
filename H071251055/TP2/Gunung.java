public class Gunung {

    // Atribut
    public String namaGunung;
    public int    ketinggian;
    public String tingkatKesulitan;

    // Constructor default
    public Gunung() {
        this.namaGunung        = "Gunung Tak Dikenal";
        this.ketinggian        = 1000;
        this.tingkatKesulitan  = "Mudah";
    }

    // Constructor dengan parameter
    public Gunung(String namaGunung, int ketinggian, String tingkatKesulitan) {
        this.namaGunung        = namaGunung;
        this.ketinggian        = ketinggian;
        this.tingkatKesulitan  = tingkatKesulitan;
    }

    // Getter
    public String getNamaGunung() {
        return namaGunung;
    }

    // Behaviour: menampilkan info gunung
    public String infoGunung() {
        return namaGunung + " | Ketinggian: " + ketinggian + " mdpl | Kesulitan: " + tingkatKesulitan;
    }
}
