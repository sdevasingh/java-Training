package Day29;

   class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Prob1 {

    static class Solution {

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode d = new ListNode(0);
            d.next = head;

            ListNode f = d, s = d;

            for (int i = 0; i <= n; i++)
                f = f.next;

            while (f != null) {
                f = f.next;
                s = s.next;
            }

            s.next = s.next.next;
            return d.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5)))));

        Solution sol = new Solution();
        head = sol.removeNthFromEnd(head, 2);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
} 


