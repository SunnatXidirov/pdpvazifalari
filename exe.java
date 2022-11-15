import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,k=0;
        System.out.print("a tomonni kiriting :");
        a = sc.nextInt();
        System.out.println(a+" "+giveNumber(a, k)+" xonali son");
    }

    public static int giveNumber(int a, int k) {
        while (a>0){
            a/=10;
            k++;
        }
        return k;
    }
}
