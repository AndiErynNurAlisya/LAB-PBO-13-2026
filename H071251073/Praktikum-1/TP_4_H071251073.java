import java.util.Scanner;

public class TP_4_H071251073 {

    static int faktorial(int n){
        if(n == 0){
            return 1;
        }
        return n * faktorial(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input : ");
        int n = input.nextInt();

        System.out.println("Output : " + faktorial(n));
    }
}