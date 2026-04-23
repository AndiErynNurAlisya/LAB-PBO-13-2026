import java.util.Scanner;

public class Main2 {

    static void tampilMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
        System.out.print(">>> Pilih menu (1-4):  ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TokoElektronik toko = new TokoElektronik(sc);

        while (true) {
            tampilMenu();
            try {
                int pilihan = Integer.parseInt(sc.nextLine().trim());

                if (pilihan == 1) {
                    toko.tambahProduk();
                } else if (pilihan == 2) {
                    toko.tampilkanSemua();
                } else if (pilihan == 3) {
                    toko.beliProduk();
                } else if (pilihan == 4) {
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    sc.close();
                    System.exit(0);
                } else {
                    System.out.println("Pilihan tidak valid. Masukkan angka 1-4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
            }
        }
    }
}
