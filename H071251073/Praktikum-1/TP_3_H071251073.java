import java.util.Scanner;

public class TP_3_H071251073 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        int hurufBesar = 0;
        int hurufKecil = 0;
        int angka = 0;

        for (int i =0; i < password.length(); i++) {
            char c =password.charAt(i);

            if (c >=  'A' && c <= 'Z') {
                hurufBesar++;
            }
            else if (c >= 'a' && c <= 'z') {
                hurufKecil++;
             }
            else if (c >= '0' && c <= '9') {
                angka++;
            }
        }
        if (password.length() >= 8 && hurufBesar > 0 && hurufKecil > 0 && angka > 0) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
    }
}