
import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        int index;
        System.out.printf("word :");
        word = sc.nextLine();
        System.out.printf("index :");
        index = sc.nextInt();

        System.err.println(giveStr(word,index));
    }
    public static String giveStr(String word,int index) {

        if(index+1<word.length())
            return word.substring(index,(index+2));
        return word.substring(0,2);
    }
}
