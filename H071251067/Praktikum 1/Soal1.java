import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println(" masukkan judul :");

        String[] kalimat = x.nextLine().split(" ");
        String hasil = "";

        for (String kata : kalimat) {
            if (kata.length() > 0){
                hasil += Character.toUpperCase(kata.charAt(0)) + kata.substring(1) + " ";

            }
        }
        System.out.println(hasil.trim());
    }
}
