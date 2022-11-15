import java.util.Scanner;

public class stringClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double way,time,speed;
        System.out.printf("masofani kmda kiriting :");
        way=sc.nextInt();
        System.out.printf("vaqtni minutda kiriting :");
        time=sc.nextInt();
        speed=(way*1000)/time*60;
        System.out.println(speed+" m/s");

    }
}