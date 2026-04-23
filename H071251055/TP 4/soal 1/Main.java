import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void tampilMenu() {
        System.out.println("----------------------------------------");
        System.out.println(" ===== BANGUN RUANG =====");
        System.out.println(" 1. KUBUS");
        System.out.println(" 2. BALOK");
        System.out.println(" 3. BOLA");
        System.out.println(" 4. TABUNG");
        System.out.println();
        System.out.println(" ===== BANGUN DATAR =====");
        System.out.println(" 5. PERSEGI");
        System.out.println(" 6. PERSEGI PANJANG");
        System.out.println(" 7. LINGKARAN");
        System.out.println(" 8. TRAPESIUM");
        System.out.println(" 0. EXIT");
        System.out.println("----------------------------------------");
        System.out.print("Pilihan: ");
    }

    public static void main(String[] args) {
        while (true) {
            try {
                tampilMenu();
                int pilihan = Integer.parseInt(sc.nextLine().trim());
                System.out.println("----------------------------------------");

                switch (pilihan) {
                    case 0:
                        System.out.println("Program selesai. Terima kasih!");
                        return;

                    case 1:
                        System.out.print("Masukkan sisi kubus: ");
                        double s = Double.parseDouble(sc.nextLine().trim());
                        new Kubus(s).tampilkan();
                        break;

                    case 2:
                        System.out.print("Masukkan panjang balok: ");
                        double p = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Masukkan lebar balok  : ");
                        double l = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Masukkan tinggi balok : ");
                        double t = Double.parseDouble(sc.nextLine().trim());
                        new Balok(p, l, t).tampilkan();
                        break;

                    case 3:
                        System.out.print("Masukkan jari-jari bola: ");
                        double rb = Double.parseDouble(sc.nextLine().trim());
                        new Bola(rb).tampilkan();
                        break;

                    case 4:
                        System.out.print("Masukkan jari-jari tabung: ");
                        double rt = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Masukkan tinggi tabung   : ");
                        double tt = Double.parseDouble(sc.nextLine().trim());
                        new Tabung(rt, tt).tampilkan();
                        break;

                    case 5:
                        System.out.print("Masukkan sisi persegi: ");
                        double sp = Double.parseDouble(sc.nextLine().trim());
                        new Persegi(sp).tampilkan();
                        break;

                    case 6:
                        System.out.print("Masukkan panjang persegi panjang: ");
                        double pp = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Masukkan lebar persegi panjang  : ");
                        double lp = Double.parseDouble(sc.nextLine().trim());
                        new PersegiPanjang(pp, lp).tampilkan();
                        break;

                    case 7:
                        System.out.print("Masukkan jari-jari lingkaran: ");
                        double rl = Double.parseDouble(sc.nextLine().trim());
                        new Lingkaran(rl).tampilkan();
                        break;

                    case 8:
                        System.out.print("Masukkan sisi 1 trapesium: ");
                        double s1 = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Masukkan sisi 2 trapesium: ");
                        double s2 = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Masukkan sisi 3 trapesium: ");
                        double s3 = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Masukkan sisi 4 trapesium: ");
                        double s4 = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Masukkan tinggi trapesium: ");
                        double th = Double.parseDouble(sc.nextLine().trim());
                        new Trapesium(s1, s2, s3, s4, th).tampilkan();
                        break;

                    default:
                        System.out.println("Pilihan tidak valid. Masukkan angka 0-8.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            } catch (Exception e) {
                System.out.println("Terjadi error: " + e.getMessage());
            }

            System.out.println("----------------------------------------");
        }
    }
}
