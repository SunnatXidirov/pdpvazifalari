import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word, result = "", word1;
        System.out.printf("word :");
        word = sc.nextLine();
        System.out.printf("word1 :");
        word1 = sc.nextLine();

        System.err.println(giveStr(word, word1));
    }

    public static String giveStr(String word, String word1) {

        if (word.charAt(word.length()-1) == word1.charAt(0))
            return word.substring(0).concat(word1.substring(1));
        return "hayr";
    }
}
