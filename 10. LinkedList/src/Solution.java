
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // Auxiliary starting node
        ListNode current = dummy; // Pointer to traverse the result

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // Attach node from list1
                list1 = list1.next;
            } else {
                current.next = list2; // Attach node from list2
                list2 = list2.next;
            }
            current = current.next; // Move to the next result node
        }

        // Attach remaining nodes from list1 or list2
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next; // Return the node next to dummy, as it was auxiliary
    }
}
