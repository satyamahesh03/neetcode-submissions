/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = reverse(slow);


        while(secondHalf!=null){
            if(firstHalf.val != secondHalf.val) return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}