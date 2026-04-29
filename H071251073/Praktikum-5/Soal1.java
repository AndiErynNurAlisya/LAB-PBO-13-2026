import java.util.Scanner;

abstract class Karyawan {
    private String nama;
    private String idKaryawan;
    protected int jumlahKehadiran = 0;

    public Karyawan(String nama, String idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
    }

    public void absen() {
        jumlahKehadiran++;
    }

    public abstract double hitungGaji();

    public String getNama() {
        return nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }
}

class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double tunjanganMakan;

    public KaryawanTetap(String nama, String id, double gajiPokok, double tunjanganMakan) {
        super(nama, id);
        this.gajiPokok = gajiPokok;
        this.tunjanganMakan = tunjanganMakan;
    }

    @Override
    public double hitungGaji() {
        double total = gajiPokok + (tunjanganMakan * jumlahKehadiran);

        if (jumlahKehadiran > 20) {
            System.out.println("Bonus Karyawan Tetap Rp500.000 diberikan!");
            total += 500000;
        }

        return total;
    }

    // Overloading (tetap ada sesuai soal)
    public double hitungGaji(double bonusKinerja) {
        return hitungGaji() + bonusKinerja;
    }
}

class KaryawanKontrak extends Karyawan {
    private double upahPerHari;

    public KaryawanKontrak(String nama, String id, double upahPerHari) {
        super(nama, id);
        this.upahPerHari = upahPerHari;
    }

    @Override
    public double hitungGaji() {
        double total = upahPerHari * jumlahKehadiran;

        if (jumlahKehadiran > 20) {
            System.out.println("Bonus Karyawan Kontrak Rp500.000 diberikan!");
            total += 500000;
        }

        return total;
    }
}

public class Soal1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        KaryawanTetap tetap = new KaryawanTetap("Budi", "KT01", 5000000, 30000);

        System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama: " + tetap.getNama());
        System.out.println("ID: " + tetap.getIdKaryawan());

        System.out.print("Masukkan jumlah kehadiran: ");
        int hadirTetap = input.nextInt();

        for (int i = 0; i < hadirTetap; i++) {
            tetap.absen();
        }

        System.out.println("Total Gaji: " + tetap.hitungGaji());

        System.out.println();

        KaryawanKontrak kontrak = new KaryawanKontrak("Andi", "KK01", 100000);

        System.out.println("=== Karyawan Kontrak ===");
        System.out.println("Nama: " + kontrak.getNama());
        System.out.println("ID: " + kontrak.getIdKaryawan());

        System.out.print("Masukkan jumlah kehadiran: ");
        int hadirKontrak = input.nextInt();

        for (int i = 0; i < hadirKontrak; i++) {
            kontrak.absen();
        }

        System.out.println("Total Gaji: " + kontrak.hitungGaji());

        input.close();
    }
}