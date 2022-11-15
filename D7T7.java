import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.printf("Enter number :");
        number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == Math.pow(2, j)) {
                    System.err.print(i + " ");
                }

            }
        }
    }
}