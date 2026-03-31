import java.util.Scanner;

public class TP_1_H071251073 {
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan judul film :");
        System.out.print("> ");
        String input = a.nextLine();

    ubahKapital(input);
    }
    public static void ubahKapital(String kalimat){
        String[] kataKata = kalimat.split(" ");
    
    for (String k : kataKata) {
        String hasil = k.substring(0, 1).toUpperCase();
        String sisa = k.substring(1).toLowerCase();
        System.out.print(hasil + sisa +" ");
    }
    }       

