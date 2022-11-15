import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sanoq = 0;
        System.out.print("Enter number :");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sanoq++;
                }
            }
            if (sanoq == 2) {
                System.err.print(i + " ");
            }
            sanoq = 0;

        }
    }
}