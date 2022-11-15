import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,result=0;
        System.out.printf("Enter number :");
        number=sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if(i%7==0){
                System.err.print(i+" ");
            }

        }
    }
}