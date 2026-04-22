import java.util.Scanner;

public class TokoElektronik {
    Product[] stok    = new Product[100];
    int       jumlah  = 0;
    Scanner   sc;

    public TokoElektronik(Scanner sc) {
        this.sc = sc;
        stok[0] = new Smartphone("Samsung", 123456, 899.99,  6.5, 256);
        stok[1] = new Laptop    ("Dell",    987654, 1299.99, 16,  "Intel Core i7");
        stok[2] = new Camera    ("Canon",   456789, 699.99,  24,  "Telephoto");
        jumlah  = 3;
    }

    public void tambahProduk() {
        try {
            System.out.print("Masukkan nama produk: ");
            String brand = sc.nextLine();

            System.out.print("Masukkan nomor seri: ");
            int seriesNumber = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Masukkan harga: ");
            double price = Double.parseDouble(sc.nextLine().trim());

            System.out.println("Pilih tipe produk:");
            System.out.println("1. Smartphone");
            System.out.println("2. Laptop");
            System.out.println("3. Camera");
            System.out.print("Pilih tipe produk (1-3): ");
            int tipe = Integer.parseInt(sc.nextLine().trim());

            if (tipe == 1) {
                System.out.print("Masukkan ukuran layar (inci): ");
                double screen = Double.parseDouble(sc.nextLine().trim());
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storage = Integer.parseInt(sc.nextLine().trim());
                stok[jumlah] = new Smartphone(brand, seriesNumber, price, screen, storage);
                jumlah++;
                System.out.println("Smartphone berhasil ditambahkan.");

            } else if (tipe == 2) {
                System.out.print("Masukkan ukuran RAM (GB): ");
                int ram = Integer.parseInt(sc.nextLine().trim());
                System.out.print("Masukkan tipe prosesor: ");
                String proc = sc.nextLine();
                stok[jumlah] = new Laptop(brand, seriesNumber, price, ram, proc);
                jumlah++;
                System.out.println("Laptop berhasil ditambahkan.");

            } else if (tipe == 3) {
                System.out.print("Masukkan resolusi (MP): ");
                int res = Integer.parseInt(sc.nextLine().trim());
                System.out.print("Masukkan tipe lensa: ");
                String lens = sc.nextLine();
                stok[jumlah] = new Camera(brand, seriesNumber, price, res, lens);
                jumlah++;
                System.out.println("Kamera berhasil ditambahkan.");

            } else {
                System.out.println("Tipe produk tidak valid.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid! Harap masukkan angka yang benar.");
        }
    }

    public void tampilkanSemua() {
        if (jumlah == 0) {
            System.out.println("Stok kosong.");
            return;
        }
        System.out.println("Daftar Produk:");
        for (int i = 0; i < jumlah; i++) {
            stok[i].displayInfo();
            System.out.println();
        }
    }

    public void beliProduk() {
        try {
            System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
            int nomor = Integer.parseInt(sc.nextLine().trim());

            for (int i = 0; i < jumlah; i++) {
                if (stok[i].seriesNumber == nomor) {
                    System.out.println("Anda telah membeli produk:");
                    stok[i].displayInfo();
                    // Geser elemen array ke kiri untuk menghapus produk
                    for (int j = i; j < jumlah - 1; j++) {
                        stok[j] = stok[j + 1];
                    }
                    stok[jumlah - 1] = null;
                    jumlah--;
                    return;
                }
            }
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid! Nomor seri harus berupa angka.");
        }
    }
}
