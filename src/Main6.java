import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    //    https://leetcode-cn.com/problems/integer-to-roman/
    public static String intToRoman(int num) {
        String[] split = (num + "").split("");
        String s1="",s2="",s3="",s4="";
        String str[]=new String[]{"","M","MM","MMM"};
        String str1[]=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String str2[]=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String str3[]=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        int flag=0;
        if(split.length>=4){
            int i = Integer.parseInt(split[flag++]);
            s1=str[i];
        }
        if(split.length>=3){
            int i = Integer.parseInt(split[flag++]);
            s2=str1[i];
        }
        if(split.length>=2){
            int i = Integer.parseInt(split[flag++]);
            s3=str2[i];
        }
        if(split.length>=1){
            int i = Integer.parseInt(split[flag++]);
            s4=str3[i];
        }
        return s1+s2+s3+s4;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            Integer next1 = scanner.nextInt();
            System.out.println(intToRoman(next1));
        }
    }

}
