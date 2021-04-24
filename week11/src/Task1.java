import org.junit.Test;

/**
 * 反转链表
 * @author xunle
 */
public class Task1 {
    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(
                4, new ListNode(5, new ListNode(6, null))))));

        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + "->");
            p = p.next;
        }
        System.out.println(p);

//        ListNode reverse = reverse(head);
        ListNode reverse = reverse2(head);

        while (reverse != null) {
            System.out.print(reverse.val + "->");
            reverse = reverse.next;
        }
        System.out.println(reverse);
    }

    /**
     * 迭代法
     * @param head 传入需要反转的链表的头指针
     * @return 返回pre
     */
    public static ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    /**
     * 递归法
     * @param head 传入反抓链表头节点
     * @return 返回最后一个节点
     */
    public static ListNode reverse2(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode last = reverse2(head.next);
        head.next.next = head;
        head.next = null;

        return last;
    }
}
