import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print(" son kiriting a:");
        n=sc.nextInt();
        System.out.printf(n+"+"+(n*10+n)+"+"+"+"+(n*100+n*10+n)+"+"+(n*1000+n*100+n*10+n)+" :");
        System.out.print(n+(n*10+n)+(n*100+n*10+n)+(n*1000+n*100+n*10+n));
    }
}