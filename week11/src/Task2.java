import org.junit.Test;

/**
 * 合并链表
 * @author xunle
 */
public class Task2 {

    @Test
    public void test() {
        ListNode h1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(
                4, new ListNode(5, new ListNode(6, null))))));
        ListNode h2 = new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(
                6, new ListNode(7, new ListNode(9, null))))));
        ListNode p1 = h1, p2 = h2;
        while (p1 != null) {
            System.out.print(p1.val + "->");
            p1 = p1.next;
        }
        System.out.println(p1);
        while (p2 != null) {
            System.out.print(p2.val + "->");
            p2 = p2.next;
        }
        System.out.println(p2);

        ListNode h3 = merge(h1, h2);

        while (h3 != null) {
            System.out.print(h3.val + "->");
            h3 = h3.next;
        }
        System.out.println(h3);
    }

    public ListNode merge(ListNode h1, ListNode h2) {
        ListNode h3 = new ListNode();

        if (h1.val < h2.val) {
            h3.val = h1.val;
            h1 = h1.next;
        } else {
            h3.val = h2.val;
            h2 = h2.next;
        }

        ListNode p = h3;

        while (h1 != null && h2 != null) {
            ListNode q = new ListNode();
            if (h1.val < h2.val) {
                q.val = h1.val;
                h1 = h1.next;
            } else {
                q.val = h2.val;
                h2 = h2.next;
            }
            p.next = q;
            p = p.next;
        }

        if (h1 == null) {
            p.next = h2;
        } else {
            p.next = h1;
        }

        return h3;
    }
}
