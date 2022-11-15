import java.util.Scanner;

public class stringClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  Money, kurs, Sum;
        System.out.printf("kursini kiriting :");
        kurs=sc.nextInt();
        System.out.printf("summani kiriting :");
        Money=sc.nextInt();
        Sum=Money*kurs;
        System.out.println(Money+" dollar "+ Sum +" so'm bo'ladi" );
    }
}