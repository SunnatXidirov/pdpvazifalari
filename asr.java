import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("yilni kiriting :");
        a = sc.nextInt();
        System.err.println(a+"-yil "+giveNumber(a)+" asrga tog'ri keladi");
    }

    public static int giveNumber(int a) {
        return a / 100;
    }
}