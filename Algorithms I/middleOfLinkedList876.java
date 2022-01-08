class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode ender = head;
        while (middle != null && ender != null && ender.next != null) {
            middle = middle.next;
            ender = ender.next.next;
        }
        return middle;
    }
}
