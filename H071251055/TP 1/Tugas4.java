import java.util.Scanner ;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in) ;
        System.out.println("Masukkan Angka : ");
        int bilangan = a.nextInt() ;
        int hasil = faktorial(bilangan);
        System.out.println(hasil);
    }
    public static int faktorial(int n) {
       
        if (n == 0) {
            return 1;
        }
        else {
            return n * faktorial(n - 1);
        }
    }
}