import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1, number2,p;
        System.out.printf("Enter number1 :");
        number1=sc.nextInt();
        System.out.printf("Enter number2 :");
        number2=sc.nextInt();
        System.out.printf("Enter p :");
        p=sc.nextInt();

        if(number1>number2) {
            for (int i = 1; i <number1; i++){
                if(i%p==0){
                    System.out.print(i+" ");
                }
            }

        }else {
            for (int i = 1; i <number2; i++){
                if(i%p==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}