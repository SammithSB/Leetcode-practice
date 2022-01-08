/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
*/

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;
        ListNode second = head, temporary = new ListNode(-1, head), first = temporary, ans = temporary;
        int cnt = 0;
        while (second != null) {
            if (cnt < n) {
                second = second.next;
                cnt += 1;
            } else {
                first = first.next;
                second = second.next;
            }
        }
        if (first.next != null) {
            first.next = first.next.next;
        }
        return ans.next;
    }
}