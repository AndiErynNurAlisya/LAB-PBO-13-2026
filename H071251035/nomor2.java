import java.util.Scanner;

public class nomor2 {
    
        // NO.2
    public static String ubahTanggal(String tgl) {
        String[] bagian = tgl.split("-");

        int hari = Integer.parseInt(bagian[0]);
        int bulan = Integer.parseInt(bagian[1]);
        int tahun = Integer.parseInt(bagian[2]);
        if (tahun>= 50) {
            tahun += 1900;
        } else {
            tahun += 2000;
        }
        
      


        String[] namaBulan = {
            "Januari","Februari","Maret","April","Mei","Juni",
            "Juli","Agustus","September","Oktober","November","Desember"
        };

        return hari + " " + namaBulan[bulan - 1] + " " + tahun;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        // Nomor 2
        System.out.println("\n NO.2");
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String tgl = sc.next();
        System.out.println(ubahTanggal(tgl));
    
      sc.close();
    } 
} 
    