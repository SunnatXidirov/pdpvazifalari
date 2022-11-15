import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.printf("enter number :");
        number = sc.nextInt();

        System.out.println(PrimeCheck(number));


    }


    public static String PrimeCheck(int number) {
        int cor=0;
        for (int i = 1; i <= number; i++) {
            if ( number%i==0){
                cor++;
            }
        }
        if(cor>2)
                 return "tub son emas";
            return "tub son";

    }

}