import java.util.Scanner;

public class P1_4_H071251056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int n = scanner.nextInt();
        
        System.out.println("Output: " + factorial(n));
        scanner.close();
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}