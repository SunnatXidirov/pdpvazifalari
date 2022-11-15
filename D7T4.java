import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.printf("enter number :");
        number=sc.nextInt();

        NonRepeatingNumbers(number);
        

    }
    public static void NonRepeatingNumbers(int number){
        int a,b,c;
        if(99<number && number<1000) {
            for (int i = 0; i < number; i++) {
                a = i / 100;
                b = i / 10 % 10;
                c = i % 10;
                if (a != b && b != c && a != c) {
                    System.err.print(i + " ");
                }
            }
        }else {
            System.err.println("3 xonali son kiriting");
        }
    }
}