import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word,word2;
        System.out.printf("word :");
        word = sc.nextLine();
        System.out.printf("word2 :");
        word2 = sc.nextLine();
        System.err.println(giveStr(word,word2));
    }
    public static String giveStr(String word,String word2) {

       return  word.substring(1).concat(word2.substring(1));
    }
}