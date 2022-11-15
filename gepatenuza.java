import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("a tomonni kiriting :");
        a = sc.nextInt();
        System.out.print("b tomonni kiriting :");
        b = sc.nextInt();
        System.out.println("uchburchakning gepatenuzasi :"+giveNumber(a, b));
    }

    public static double giveNumber(int a, int b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
}