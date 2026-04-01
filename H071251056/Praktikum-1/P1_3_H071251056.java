import java.util.Scanner;

public class P1_3_H071251056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: Masukkan password: ");
        String password = scanner.nextLine();
        
        if (isValid(password)) {
            System.out.println("Output: Password valid");
        } else {
            System.out.println("Output: Password tidak valid");
        }
        scanner.close();
    }

    public static boolean isValid(String password) {
        if (password.length() < 8) return false;
        
        boolean hasUpper = false, hasLower = false, hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
        }
        
        return hasUpper && hasLower && hasDigit;
    }
}