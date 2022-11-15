import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word,result="",word1;
        System.out.printf("word :");
        word = sc.nextLine();
        System.out.printf("word1 :");
        word1 = sc.nextLine();

        System.err.println(giveStr(word,word1));
    }

    public static String giveStr(String word,String word1) {

        return word.concat(word1+word1+word);
    }
}