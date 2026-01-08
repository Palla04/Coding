public class DeleteNode_in_LinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Function to delete the given node (not the tail)
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    // Helper function to print the linked list
    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        DeleteNode_in_LinkedList sol = new DeleteNode_in_LinkedList();

        // Creating linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Before deletion:");
        printList(head);

        // Deleting node with value 5
        sol.deleteNode(head.next.next);

        System.out.println("After deletion:");
        printList(head);
    }
}
