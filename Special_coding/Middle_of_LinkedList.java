public class Middle_of_LinkedList {
    public static void main(String[] args) {

        // Creating linked list: 1 → 2 → 3 → 4 → 5 → 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        Solution sol = new Solution();
        ListNode middle = sol.middleNode(head);

        System.out.println("Middle node value: " + middle.val);
    }
}
class ListNode {
    int val;
    ListNode next;

    // Default constructor
    ListNode() {}

    // Constructor with value
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Constructor with value and next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }
}