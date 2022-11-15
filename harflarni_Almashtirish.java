import java.util.Scanner;
public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        char last='x',last_1='x';
        System.out.printf("word :");
        word = sc.nextLine();
        System.err.println(giveStr(word,last,last_1));
    }
    public static String giveStr(String word,char last, char last_1) {
        last_1=word.charAt(word.length()-2);
        last=word.charAt(word.length()-1);

      return   word.substring(0,word.length()-2).concat(""+last).concat(""+last_1);
    }
}