import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.printf("Enter number :");
        number=sc.nextInt();

        for(int i=1; i<11; i++){
            System.out.println(number+" * "+i+" = "+number*i);
        }


    }
}
