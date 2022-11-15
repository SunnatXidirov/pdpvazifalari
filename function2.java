
import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,x,b;
        System.out.println("f(x) = kx^2 +b, funksiya qiymatini hisoblovchi method");
        System.out.print("k ni kiriting :");
        k=sc.nextInt();
        System.out.print("b ni kiriting :");
        b=sc.nextInt();
        System.out.print("x ni kiriting :");
        x=sc.nextInt();
        System.out.println(giveNumber(k, b, x));
    }
    public static double giveNumber(int k,int b,int x){
        if(x>0 && x<40)
            return k * Math.pow(x, 2) + b;
        return 0;
    }
}