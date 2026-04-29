public class Main {
    public static void main(String[] args) {

        // --- KaryawanTetap ---
        KaryawanTetap kt = new KaryawanTetap("Budi", "KT-001", 5000000, 25000);
        // Absen 15 kali
        for (int i = 0; i < 15; i++) {
            kt.absen();
        }
        System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama         : " + kt.getNama());
        System.out.println("ID           : " + kt.getIdKaryawan());
        System.out.println("Kehadiran    : " + kt.getJumlahKehadiran() + " hari");
        System.out.println("Gaji (tanpa bonus)  : Rp" + kt.hitungGaji());
        System.out.println("Gaji (dengan bonus) : Rp" + kt.hitungGaji(1000000));

        System.out.println();

        // --- KaryawanKontrak ---
        KaryawanKontrak kk = new KaryawanKontrak("Siti", "KK-001", 200000);
        // Absen 22 kali (lebih dari 20, trigger bonus flat)
        for (int i = 0; i < 22; i++) {
            kk.absen();
        }
        System.out.println("=== Karyawan Kontrak ===");
        System.out.println("Nama         : " + kk.getNama());
        System.out.println("ID           : " + kk.getIdKaryawan());
        System.out.println("Kehadiran    : " + kk.getJumlahKehadiran() + " hari");
        System.out.println("Total Gaji   : Rp" + kk.hitungGaji());
        
    }
}
