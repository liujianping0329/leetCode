import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main15 {
//    https://leetcode-cn.com/problems/score-after-flipping-matrix/

    public static int matrixScore(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            if(A[i][0]==0){
                A[i]=reverse(A[i]);
            }
        }

        for (int i = 0; i < A[0].length; i++) {
            int [] temp=new int[A.length];
            for (int j = 0; j < A.length; j++) {
                temp[j]=A[j][i];
            }
            if(isZeroMore(temp)){
                int[] reverse = reverse(temp);
                for (int j = 0; j < A.length; j++) {
                    A[j][i]=reverse[j];
                }
            }
        }

        int plus=0;
        for (int i = 0; i < A.length; i++) {
            plus+= Integer.parseInt(joinIt(A[i]), 2);
        }
        return plus;
    }

    private static String joinIt(int[] ints) {
        String ans="";
        for (int i = 0; i < ints.length; i++) {
            ans+=ints[i]+"";
        }
        return ans;
    }

    private static boolean isZeroMore(int[] temp) {
        int cou1=0;int cou0=0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]==0){
                cou0++;
            }else{
                cou1++;
            }
        }
        if(cou0>cou1)return true;
        return false;
    }

    private static int[] reverse(int[] ints) {
        int [] ans=new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]==0){
                ans[i]=1;
            }else{
                ans[i]=0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] A=new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        matrixScore(A);
    }


}
