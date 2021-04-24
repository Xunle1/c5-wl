import org.junit.Test;

/**
 * 判断回文链表
 * @author xunle
 */
public class Task3 {
    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(
                3, new ListNode(2, new ListNode(1, null))))));

        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + "->");
            p = p.next;
        }
        System.out.println(p);

        System.out.println(isPalindrome(head));

    }

    /**
     * 双指针判断
     */
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        //cur比slow慢一步，pre将前半部分反转
        ListNode cur = head, pre = null;

        while (fast != null && fast.next != null) {
            cur = slow;
            slow = slow.next;
            fast = fast.next.next;
            cur.next = pre;
            pre = cur;
        }

        //如果fast != null，说明有链表长度为奇数，slow停在中心点
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (cur.val != slow.val) {
                return false;
            }
            slow = slow.next;
            cur = cur.next;
        }
        return true;
    }
}
