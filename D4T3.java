import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number1;
        System.out.printf("1-sonni kiriting :");
        Number1 = sc.nextInt();

        if (Number1 % 3 == 0 && Number1 % 5 == 0 || Number1 < 0) {
            System.out.println(Math.pow(Number1, 2));
        } else {
            System.out.println(Math.pow(Number1, 3));
        }
    }

}