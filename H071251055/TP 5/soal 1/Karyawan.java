public abstract class Karyawan {
    private String nama;
    private String idKaryawan;
    private int jumlahKehadiran;

    public Karyawan(String nama, String idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.jumlahKehadiran = 0;
    }

    // Method konkrit: menambah kehadiran sebanyak 1
    public void absen() {
        this.jumlahKehadiran++;
    }

    // Getter untuk diakses subclass
    public String getNama() { return nama; }
    public String getIdKaryawan() { return idKaryawan; }
    public int getJumlahKehadiran() { return jumlahKehadiran; }

    // Abstract method wajib diimplementasikan subclass
    public abstract double hitungGaji();
}