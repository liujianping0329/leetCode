import java.util.*;

public class Main43 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        for(int i=1;i<triangle.size();i++){
            List<Integer> cur=triangle.get(i);
            for (int j = 0; j < cur.size(); j++) {
                if(j==0){
                    cur.set(j,cur.get(j)+triangle.get(i-1).get(j));
                }else if(j==cur.size()-1){
                    cur.set(j,cur.get(j)+triangle.get(i-1).get(j-1));
                }else{
                    if(triangle.get(i-1).get(j-1)>triangle.get(i-1).get(j)){
                        cur.set(j,cur.get(j)+triangle.get(i-1).get(j));
                    }else{
                        cur.set(j,cur.get(j)+triangle.get(i-1).get(j-1));
                    }
                }
            }
        }
        return Collections.min(triangle.get(triangle.size()-1));
    }

    public static void main(String[] args) {
//        https://leetcode-cn.com/problems/triangle/
        System.out.println(minimumTotal(new ArrayList<List<Integer>>(){{
            add(new ArrayList<Integer>(){{
                add(2);
            }});
            add(new ArrayList<Integer>(){{
                add(3);
                add(4);
            }});
            add(new ArrayList<Integer>(){{
                add(6);
                add(5);
                add(7);
            }});
            add(new ArrayList<Integer>(){{
                add(4);
                add(1);
                add(8);
                add(3);
            }});
        }}));
    }


}
