import java.util.Scanner;

public class TP_2_H071251073 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input : ");
        String tanggal = input.nextLine();

        konversiTanggal(tanggal);
    }

    public static void konversiTanggal(String tgl) {

        String[] bagian = tgl.split("-");

        int hari = Integer.parseInt(bagian[0]);
        int bulan = Integer.parseInt(bagian[1]);
        int tahun = Integer.parseInt(bagian[2]);

        String[] namaBulan = {
            "Januari","Februari","Maret","April","Mei","Juni",
            "Juli","Agustus","September","Oktober","November","Desember"
        };

        if (tahun <= 30) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }

        System.out.println("Output : " + hari + " " + namaBulan[bulan-1] + " " + tahun);
    }
}