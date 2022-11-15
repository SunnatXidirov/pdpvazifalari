
import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, surname;
        System.out.printf("name :");
        name = sc.nextLine();
        System.out.printf("surname :");
        surname = sc.nextLine();
        System.err.println("Hello ".concat(name+" "+surname));
    }
}