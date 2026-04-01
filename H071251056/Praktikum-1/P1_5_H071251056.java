import java.util.InputMismatchException;
import java.util.Scanner;

public class P1_5_H071251056 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input:");
        try {
            int target = scanner.nextInt();
            boolean found = false;
            
            cariAngka: 
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "] [" + j + "]");
                        found = true;
                        break cariAngka; 
                    }
                }
            }
            
            if (!found) System.out.println("Angka tidak ditemukan.");
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa bilangan bulat valid.");
        } finally {
            scanner.close();
        }
    }
}