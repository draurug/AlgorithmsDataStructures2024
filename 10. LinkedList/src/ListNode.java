public class ListNode {
    int val;
    ListNode next;

    // Constructor to initialize the node with a value
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Helper method to create a linked list from an array
    public static ListNode fromArray(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
