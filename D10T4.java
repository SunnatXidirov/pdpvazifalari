import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        double x1, x2, D;
        System.out.println("ax^2 + bx +c");
        System.out.printf("a =");
        a = scanner.nextInt();
        System.out.printf("b =");
        b = scanner.nextInt();
        System.out.printf("c =");
        c = scanner.nextInt();
        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("1- ildizi :" + x1);
            System.out.println("2- ildizi :" + x2);
        } else if (D < 0) {
            System.err.println("Diskriminant manfiy cheimga ega emas");
        } else {
            System.out.printf("Diskriminant nolga teng tenglamaning yecmi 1ta ");
        }
    }
}