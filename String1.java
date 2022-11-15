import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        int Length;
        System.out.printf("word :");
        word = sc.nextLine();
        System.err.println(giveStr(word));

    }
    public static String giveStr(String word) {

       return word.substring((word.length()/2)-1,(word.length()/2)+1);

    }
}