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
    public void reorderList(ListNode head) {
        bruteForce(head);
    }

    void bruteForce(ListNode head) {
        ListNode root = head;
        while (root != null && root.next != null) {
            // Find the last node and its previous node
            ListNode prev = null, next = root;
            while (next.next != null) {
                prev = next;
                next = next.next;
            }

            // If we have only one node left, break
            if (root == next) {
                break;
            }

            // Adjust pointers
            prev.next = null; // Remove the last node from the list
            ListNode temp = root.next; // Store the next node
            root.next = next; // Append the last node after the current root
            next.next = temp; // Append the next node after the last node
            root = temp; // Move root to the next node to process
        }

    }
}