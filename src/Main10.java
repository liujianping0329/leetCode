import vo.TreeNode;

import java.util.Arrays;
import java.util.List;

public class Main10 {
    //    https://leetcode-cn.com/problems/reveal-cards-in-increasing-order/
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] ans=new int[deck.length];
        changeArr(ans,deck,deck.length-1);
        return ans;
    }

    private static void changeArr(int[] ans,int[] deck,int index) {
        if(deck.length-1-index>1){

            for (int i = deck.length  - index; i > 1; i--) {
                ans[i-1]=ans[i-2];
            }

            int temp=ans[deck.length-1-index];
            ans[deck.length-index-1]=0;
            ans[0]=temp;
        }
        if(deck.length-1-index>0){
            for (int i = deck.length  - index; i > 1; i--) {
                ans[i-1]=ans[i-2];
            }
        }
        ans[0]=deck[index];


        if(index==0)return;
        changeArr(ans,deck,--index);
    }

    public static void main(String[] args) {
        int[] ints = deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
    }


}
