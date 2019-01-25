import vo.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    //    https://leetcode-cn.com/problems/multiply-strings/
    public static String multiply(String num1, String num2) {
        String[] split1 = num1.split("");
        String[] split2 = num2.split("");

//        每一次单乘法
        List<String> singleResults=new ArrayList<>();
        for (int i = split2.length-1; i >=0 ; i--) {
            String singleResult="";
            int singleInt=Integer.parseInt(split2[i]);
            int bonus=0;
            for (int j = split1.length-1; j >=0; j--) {
                int bigSingle=Integer.parseInt(split1[j]);
                singleResult=(singleInt*bigSingle+bonus)%10+singleResult;
                bonus=(singleInt*bigSingle+bonus)/10;
            }
            if(bonus>0){
                singleResult=bonus+singleResult;
            }

            for(int k=0;k<split2.length-1-i;k++){
                singleResult+="0";
            }
            singleResults.add(singleResult);
        }

//        多个大数加
        String plusRes="";
        int bonusPlus=0;
        for(int i=1;i<=singleResults.get(singleResults.size()-1).length();i++){
            int res=0;
            for(int j=0;j<singleResults.size();j++){
                res+=obtReverInt(singleResults.get(j),i);
            }
            plusRes=(res+bonusPlus)%10+plusRes;
            bonusPlus=(res+bonusPlus)/10;
        }

        if(bonusPlus!=0){
            plusRes=bonusPlus+plusRes;
        }

        String ans="";
        int isFirst=1;
        for (int i = 0; i < plusRes.split("").length; i++) {
            if(!plusRes.split("")[i].equals("0")||isFirst==0){
                ans+=plusRes.split("")[i];
                isFirst=0;
            }
        }
        if(ans.equals(""))return "0";
        return ans;
    }

    private static int obtReverInt(String s, int i) {
        String[] split = s.split("");
        if(split.length<i)return 0;
        return Integer.parseInt(split[split.length-1-(i-1)]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next1 = scanner.nextLine();
        String next2 = scanner.nextLine();
        System.out.println(multiply(next1,next2));
    }

}
