/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
            // Edge case: empty list
        if (head == null) {
            return false;
        }
        
        // Initialize two pointers
        ListNode slow = head;
        ListNode fast = head;
        
        // Move pointers until they meet or fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer 1 step
            fast = fast.next.next;     // Move fast pointer 2 steps
            
            // If pointers meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }
        
        // If we reach here, no cycle found
        return false;
    }
}
    
