import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius, lengthdoira, Sdoira;
        System.out.print("radiusni kiriting :");
        radius = scanner.nextDouble();

        Sdoira = radius * radius * Math.PI;
        lengthdoira = 2 * Math.PI * radius;
        System.err.println("doiraning yuzi:" + Sdoira);
        System.err.println("doiraning uzunligi:" + lengthdoira);
    }
}