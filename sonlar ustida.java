import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("1 - son kiriting a:");
        a=sc.nextInt();
        System.out.print("1 - son kiriting b:");
        b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a ="+a);
        System.out.printf("b ="+b);
    }

}