import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main7 {
    //    https://leetcode-cn.com/problems/generate-parentheses/solution/
    public static List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        ans=genAllCon(ans,"",2*n);
        return ans.stream().filter(s -> checkValid(s)).collect(Collectors.toList());
    }

    private static boolean checkValid(String s) {
        Stack<Integer> stack=new Stack<>();
        for (String s1 : s.split("")) {
            if("(".equals(s1)){
                stack.push(1);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    private static List<String> genAllCon(List<String> ans,String singleRes,int n) {
        if(n==0){
            ans.add(singleRes);
            return ans;
        }
        genAllCon(ans,singleRes+"(",n-1);
        genAllCon(ans,singleRes+")",n-1);
        return ans;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer next1 = scanner.nextInt();
        generateParenthesis(next1).forEach(s -> {
            System.out.println(s);
        });
    }

}
