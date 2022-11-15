import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day;
        System.out.printf("Enter day :");
        day=sc.nextInt();
       switch (day){
           case 1: System.err.println("Dushanba ish kuni");break;
           case 2: System.err.println("Seshanba ish kuni");break;
           case 3: System.err.println("Chorshanba ish kuni");break;
           case 4: System.err.println("Payshanba ish kuni");break;
           case 5: System.err.println("Juma ish kuni");break;
           case 6: System.err.println("Shanba karotki den");break;
           case 7: System.err.println("Yakshanba dam olish kuni");break;
           default:
               System.err.println("Haftada 7 kun bor va u 1dan boshlanadi");break;

       }
    }
}