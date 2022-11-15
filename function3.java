import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y, x;
        System.out.println("f(x,y) =1/((x − y)^2 +1),Funksiya qiymatini hisoblovchi method");
        System.out.print("y ni kiriting :");
        y = sc.nextInt();
        System.out.print("x ni kiriting :");
        x = sc.nextInt();
        System.out.println(giveNumber(y, x));
    }

    public static double giveNumber(double y, double x) {
        if (0 <= x && x <= 5 && 0 <= y && y <= 10)
             return 1 / ((x-y)*(x-y) + 1);
        return 0;
    }
}
