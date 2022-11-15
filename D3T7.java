
import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int Number,a4,a3,a2,a;
        System.out.printf("nuber :");
        Number=sc.nextInt();
       a4= Number / 1000;
       a3= Number / 100 %10;
       a2= Number / 10%10;
       a= Number % 10;
       if(a==a2||a==a3||a==a4){
           System.err.println("takrorlanuvchi son :"+a);
       } else  if(a2==a3||a2==a4){
           System.err.println("takrorlanuvchi son :"+a2);
       }else  if(a3==a4){
           System.err.println("takrorlanuvchi son :"+a3);
       }

    }
}