import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, a, b, c, result;
        System.out.printf("Enter number :");
        number = sc.nextInt();
        if (number > 0 && number < 1000) {
            for (int i = 0; i < number; i++) {
                a = i / 100;
                b = i / 10 % 10;
                c = i % 10;
                result = a + b + c;
                if (result == 15) {
                    System.err.print(i + " ");
                }
            }
        }else {
            System.err.println("100 dan 999 gacha bo'lgan son kiriting");
        }
    }
}