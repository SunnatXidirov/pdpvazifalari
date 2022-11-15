import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print(" son kiriting a:");
        n=sc.nextInt();
        System.out.println(giveNumber(n));
    }
    public static char giveNumber(int n){
        if(n>0) {
            return '+';
        } else if (n==0) {
            return '0';
        }else {
            return '-';
        }

    }
}