import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main53 {
    public boolean isValid(String s) {
        String[] split = s.split("");
        Stack<String> stack=new Stack<>();
        int cou=1;
        Map<String,String> map=new HashMap<>();
        map.put(")","(");
        map.put("]","[");
        map.put("}","{");

        for (String s1 : split) {
            if("(".equals(s1)||"[".equals(s1)||"{".equals(s1)){
                stack.push(s1);
            }else{
                if(cou==1){
                    return false;
                }
                if(stack.isEmpty()){
                    return false;
                }
                String peek=stack.peek();
                if(map.get(s1).equals(peek)){
                    stack.pop();
                }else{
                    return false;
                }
            }
            cou++;
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Main53 main53=new Main53();
        boolean res = main53.isValid("{()[]{}}");
        System.out.print(res);
    }
}


