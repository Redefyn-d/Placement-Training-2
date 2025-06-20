import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class MergeSortedLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1 = input.nextInt();
        ListNode list1 = null, tail1 = null;
        for (int i = 0; i < size1; i++) {
            int val = input.nextInt();
            ListNode node = new ListNode(val);
            if (list1 == null) {
                list1 = node;
                tail1 = node;
            } else {
                tail1.next = node;
                tail1 = node;
            }
        }
        int size2 = input.nextInt();
        ListNode list2 = null, tail2 = null;
        for (int i = 0; i < size2; i++) {
            int val = input.nextInt();
            ListNode node = new ListNode(val);
            if (list2 == null) {
                list2 = node;
                tail2 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        current = dummy.next;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        input.close();
    }
}
