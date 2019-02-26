import java.util.ArrayList;
import java.util.List;

public class Main15 {
//    https://leetcode-cn.com/problems/counting-bits/

    public static int[] countBits(int num) {
        int [] ans=new int[num+1];
        for (int i = 0; i <= num; i++) {
            ans[i]=change2rd(i);
        }
        return ans;
    }
    static int change2rd(int i){
        String s = Integer.toBinaryString(i);
        int count=0;
        for (String s1 : s.split("")) {
            if(s1.equals("1")) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        countBits(3);
    }


}
