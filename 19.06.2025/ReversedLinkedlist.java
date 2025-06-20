import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseLinkedList {
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
        ListNode prev = null, current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        while (prev != null) {
            System.out.print(prev.val + " ");
            prev = prev.next;
        }
        input.close();
    }
}
