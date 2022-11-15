import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.printf("word :");
        word = sc.nextLine();

        System.err.println(giveStr(word));
    }

    public static String giveStr(String word) {
        if(word.length()>2)
            return word.substring(0,2);
        return word;


    }
}