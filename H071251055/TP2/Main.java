public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("     SIMULASI PENDAKIAN GUNUNG       ");
        System.out.println("======================================\n");

        // Objek Perlengkapan
        Perlengkapan carrier = new Perlengkapan("Carrier 60L", 8.5, "Baik");
        Perlengkapan tenda  = new Perlengkapan("Tenda Dome", 3.2, "Baik");

        // Objek Gunung
        Gunung lompobattang = new Gunung("Lompobattang", 2874, "Extreme");

        // Objek Pendaki dengan constructor berparameter
        Pendaki fharel = new Pendaki("Fharel",  90, carrier, lompobattang);
        Pendaki kalev  = new Pendaki("Kalev",   85, tenda,  lompobattang);

        // Objek Pendaki dengan constructor default
        Pendaki pemula = new Pendaki();
        System.out.println("Pendaki default: " + pemula.getNama());
        System.out.println();

        // Cek kondisi awal
        System.out.println("=== KONDISI AWAL ===");
        fharel.cekKondisi();
        kalev.cekKondisi();

        // Simulasi mendaki bersama (interaksi antar dua objek Pendaki)
        fharel.mendaki(kalev);

        // Cek kondisi akhir
        System.out.println("\n=== KONDISI AKHIR ===");
        fharel.cekKondisi();
        kalev.cekKondisi();
    }
}
