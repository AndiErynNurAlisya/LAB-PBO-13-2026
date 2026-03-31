import java.util.Scanner ;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan Judul Film : ");
        String judul = a.nextLine() ;
        String hasil = capitalize(judul) ;
        System.out.println(hasil);
    }

    public static String capitalize (String judul){
        String[] kata = judul.toLowerCase().split(" ");
        String hasil = "" ;

        for (String x : kata) {
            if (x.length()>0) {
                hasil += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " " ;  
            }
        }
        return hasil.trim();
    
    }
}