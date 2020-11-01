package test143;

import java.util.ArrayList;

/**
 * @program: leetcode
 * @description: 给定一个单链表 L：L0→L1→…→Ln-1→Ln ， 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 * @author: zhoukun
 * @create: 2020-10-20 15:16
 **/
public class Solution {



    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {
        if (head==null){
            return;
        }
        ArrayList<ListNode> listNodes = new ArrayList<>();
        ListNode node = head;
        while (node!=null){
            listNodes.add(node);
            node = node.next;
        }
        int i = 0 , j = listNodes.size() -1;
        while (i<j){
            listNodes.get(i).next = listNodes.get(j);
            i++;
            if (i==j){
                break;
            }
            listNodes.get(j).next = listNodes.get(i);
            j--;
        }
        listNodes.get(i).next = null;
    }


}
