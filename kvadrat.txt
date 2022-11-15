import java.util.Scanner;

public class stringClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, Peremtr, yuza;
        System.out.printf("kvadratning toonini kiriting :");
        a = sc.nextInt();
       Peremtr=4*a;
       yuza=a*a;
        System.out.println("kvadratning peremetri :"+ Peremtr);
        System.out.println("kvadratning yuzi :"+ yuza);
    }
}