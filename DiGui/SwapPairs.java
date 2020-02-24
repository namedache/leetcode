package DiGui;

/**
 * @Classname SwapPairs
 * @Description TODO
 * @Date 2020-01-19 14:33
 * @Author zhoukun
 */
public class SwapPairs {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode swapPairs(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }


}
