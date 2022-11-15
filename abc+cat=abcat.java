// abc+cat = abcat

import java.util.Scanner;
public class HomeWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word,word1,result;
        int index=0;
        System.out.printf("word :");
        word = sc.nextLine();
        System.out.printf("word1 :");
        word1 = sc.nextLine();
        result=word.concat(word1);

     System.err.println(giveStr(result,index));
    }
    public static String giveStr(String result, int index) {

        for (int i = 0; i < result.length()/2; i++) {
            if (result.charAt(i) == result.charAt(i+1))  //abccat
                index=i;
        }
        return result.substring(0,index).concat(result.substring(index+1));
    }
}
 