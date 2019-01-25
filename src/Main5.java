import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    //    https://leetcode-cn.com/problems/reverse-words-in-a-string/
    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        List<String> words=new ArrayList<>();
        for (String s1 : split) {
            if(!"".equals(s1))words.add(s1);
        }
        Collections.reverse(words);
        return String.join(" ",words);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next1 = scanner.nextLine();
        System.out.println(reverseWords(next1.trim()));
    }

}
