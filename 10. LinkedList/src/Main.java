
public class Main {
   public static void main(String[] args) throws Exception {
      Solution solution = new Solution();

      // Example 1
      ListNode list1 = ListNode.fromArray(new int[]{1, 2, 4});
      ListNode list2 = ListNode.fromArray(new int[]{1, 3, 4});
      System.out.print("Example 1 Result: ");
      ListNode result1 = solution.mergeTwoLists(list1, list2);
      ListNode.printList(result1);

      // Example 2
      list1 = ListNode.fromArray(new int[]{});
      list2 = ListNode.fromArray(new int[]{});
      System.out.print("Example 2 Result: ");
      ListNode result2 = solution.mergeTwoLists(list1, list2);
      ListNode.printList(result2);

      // Example 3
      list1 = ListNode.fromArray(new int[]{});
      list2 = ListNode.fromArray(new int[]{0});
      System.out.print("Example 3 Result: ");
      ListNode result3 = solution.mergeTwoLists(list1, list2);
      ListNode.printList(result3);
    }
}

