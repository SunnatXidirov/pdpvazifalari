import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number :");
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                if (i % 10 == 2 || i % 10 == 4 || i % 10 == 8){
                    System.err.print(i+" ");
                }
            }
        }

    }
}