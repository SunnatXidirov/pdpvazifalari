import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word,result="";
        System.out.printf("word :");
        word = sc.nextLine();

        System.err.println(giveStr(word,result));
    }

    public static String giveStr(String word,String result) {

        result=word.substring(word.length()-2);

        return result.concat(result+result);

    }
}