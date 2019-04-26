import vo.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Main24 {




    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        TreeNode treeNode1=new TreeNode(2);
        System.out.println(treeNode.equals(treeNode1));
        System.out.println(treeNode.hashCode());
        System.out.println(treeNode1.hashCode());
        Map<TreeNode,TreeNode> hashmap=new HashMap<>();
        hashmap.put(treeNode,treeNode);
        hashmap.put(treeNode1,treeNode);
        System.out.println(hashmap.size());
    }


}
