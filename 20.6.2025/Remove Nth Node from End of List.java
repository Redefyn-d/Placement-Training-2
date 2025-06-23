import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ListNode head = null, tail = null;
        for (int i = 0; i < size; i++) {
            int val = input.nextInt();
            ListNode node = new ListNode(val);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        int n = input.nextInt();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        head = dummy.next;
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        input.close();
    }
}
