import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int Number1,Number2;
        System.out.printf("1-sonni kiriting :");
        Number1=sc.nextInt();
        System.out.printf("2-sonni kiriting :");
        Number2=sc.nextInt();
        if(Number1>Number2)
            System.err.println(Number1-Number2);
        System.err.println(Number2-Number1);
    }
}