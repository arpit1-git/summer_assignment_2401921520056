package Week_3.Day_1;

class Solution {

    int val;
    ListNode next;

    Solution(int val) {
        this.val = val;
    }
}

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
