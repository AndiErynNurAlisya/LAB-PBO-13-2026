import java.util.Scanner;

public class P1_2_H071251056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        
        System.out.println("\nOutput:\n" + convertDate(input));
        scanner.close();
    }

    public static String convertDate(String dateStr) {
        String[] parts = dateStr.split("-");
        if (parts.length != 3) return "Format tidak valid";

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        String[] monthNames = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                               "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        int fullYear = (year > 50) ? 1900 + year : 2000 + year;
        
        return day + " " + monthNames[month] + " " + fullYear;
    }
}