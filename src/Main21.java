import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main21 {
//    https://leetcode-cn.com/problems/di-string-match/

    public static int[] diStringMatch(String S) {
        return asIt(S.length()+1,S).get(0);
    }

    private static String calStr(int[] ints) {
        String ans="";
        for (int i = 0; i < ints.length-1; i++) {
            if(ints[i]<ints[i+1]){
                ans+="I";
            }else{
                ans+="D";
            }
        }
        return ans;
    }

    private static List<int[]> asIt(int length,String S) {
        if(length==1)return new LinkedList<int[]>(){{
            add(new int[]{0});
        }};
        List<int[]> ans=new LinkedList<>();
        int curInt=length-1;
        for (int[] ints : asIt(length - 1,S.substring(0,length-2))) {
            for (int i = 0; i < ints.length+1; i++) {
                int[] ints1 = insertBefore(i, ints, curInt);
                if(calStr(ints1).equals(S)){
                    ans.add(ints1);
                }
            }
        }
        return ans;
    }

    private static int[] insertBefore(int i, int[] ints,int content) {
        int [] temp=new int[ints.length+1];
        for (int i1 = 0; i1 < ints.length + 1; i1++) {
            if(i>i1){
                temp[i1]=ints[i1];
            }else if(i==i1){
                temp[i1]=content;
            }else{
                temp[i1]=ints[i1-1];
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        diStringMatch("DIIDIIIIDDDIIDDIIDIDDIIDDDIIDIDDIDIIIIIIDIIIIIDDDDDIDIDIIIDIDDDIDIDIDDIDIDDDDDIDDIDIDDDIDIDDDIIIIDDIDDDDIDIDIIDIIDDDDIIIDDDDDDIDDDDIDDDIDDIDDIIDDDDDIDIDIDDIIDIDDDDIDDDDIDDDIIIIDIDDIDIIDIDIIIDIDIIIIDIDDDIDDDIDDIIIIIIDDIDIDDDDIDIDDIIDIIDDIDDIDDIDDIDIIIIIDIDDDIDIIIIDDDDIIIDIDIIIIIIDDIDIIIDDDDDI");
    }


}
