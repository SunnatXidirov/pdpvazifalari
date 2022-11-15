import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word, result = "";
        System.out.printf("word :");
        word = sc.nextLine();

        System.err.println(giveStr(word, result));
    }

    public static String giveStr(String word, String result) {

        if(word.charAt(0)=='a' && word.charAt(1)=='b') {
            result = word;
        } else
            if (word.charAt(0) == 'a' && word.charAt(1) !='b') {
            result= word.substring(0, 1).concat(word.substring(2));
        } else
            if (word.charAt(1)=='b' && word.charAt(0) !='a') {
            result=word.substring(1);
        }else {
            result=word.substring(2);
        }

return result;
    }
}