import java.util.Scanner;

public class TP1_1_H071251056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Judul Film :");
        String input = scanner.nextLine();
        
        System.out.println(capitalize(input));
        scanner.close();
    }

    public static String capitalize(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }
}