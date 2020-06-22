import vo.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {

//    https://leetcode-cn.com/problems/add-two-numbers/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Temp=l1;
        ListNode l2Temp=l2;
        ListNode listNodeTotal=new ListNode(0);
        int flag=0;
        int isFirst=1;
        while((l1Temp!=null||l2Temp!=null)||flag!=0){
            if(l1Temp==null){
                l1Temp=new ListNode(0);
            }
            if(l2Temp==null){
                l2Temp=new ListNode(0);
            }
            ListNode listNode=new ListNode(0);
            listNode.val=(l1Temp.val+l2Temp.val+flag)%10;
            if(l1Temp.val+l2Temp.val+flag>9){
                flag=1;
            }else{
                flag=0;
            }
            if(isFirst==1){
                listNodeTotal=listNode;
                isFirst=0;
            }else{
                addNode(listNodeTotal,listNode);
            }

            l1Temp=l1Temp.next;
            l2Temp=l2Temp.next;
        }

        return listNodeTotal;
    }

    private static void addNode(ListNode listNodeTotal, ListNode listNode) {
        if(listNodeTotal.next==null){
            listNodeTotal.next=listNode;
        }else{
            addNode(listNodeTotal.next,listNode);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.nextLine();
        ListNode l1 = convert2ListNode(next.split("[+]")[0]);
        ListNode l2 = convert2ListNode(next.split("[+]")[1]);
        printNode(addTwoNumbers(l1,l2));
    }

    private static void printNode(ListNode listNode) {
        List<String> strings=new ArrayList<>();
        while(listNode!=null){
            strings.add(listNode.val+"");
            listNode=listNode.next;
        }
        System.out.println("("+String.join(" -> ",strings)+")");
    }

    private static ListNode convert2ListNode(String s) {
        List<ListNode> listNodes=new ArrayList<>();
        for (String singleNo : s.split("\\(")[1].split("\\)")[0].trim().split("->")) {
            listNodes.add(new ListNode(Integer.valueOf(singleNo.trim())));
        }
        return fillListNodeVO(listNodes);
    }

    private static ListNode fillListNodeVO(List<ListNode> listNodes) {
        if(listNodes.size()==1)return listNodes.get(0);
        ListNode remove = listNodes.remove(listNodes.size() - 1);
        listNodes.get(listNodes.size() - 1).next=remove;
        return fillListNodeVO(listNodes);
    }
}
