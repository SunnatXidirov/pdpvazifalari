import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.printf("Enter year :");
        year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.err.println(year+"-yil kabisa yili");
        }else {
            System.err.println(year+"-yil kabisa yili emas");
        }
    }
}