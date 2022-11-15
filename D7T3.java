import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1,result=0;
        System.out.printf("Enter number :");
        number1=sc.nextInt();

        for (int i = 0; i < number1; i++) {
            result+=i;
        }

        System.err.println(result);
    }
}
