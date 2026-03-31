import java.util.Scanner;

public class TP_5_H071251073 {
    public static void main(String[] args) {

        int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input : ");
            int angka = input.nextInt();

            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){

                    if(num[i][j] == angka){
                        System.out.println("Found " + angka + " at [" + i + "][" + j + "]");
                        return;
                    }

                }
            }

        } catch(Exception e){
            System.out.println("Input salah");
        }

    }
}