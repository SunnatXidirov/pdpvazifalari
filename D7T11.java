import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number :");
        number = sc.nextInt();
        if (number > 100 && number < 10000) {
            for (int i = 0; i < number; i++) {
                if (i % 47 == 43 && i % 43 == 40) {
                    System.err.print(i + " ");
                }
            }
        }
    }
}