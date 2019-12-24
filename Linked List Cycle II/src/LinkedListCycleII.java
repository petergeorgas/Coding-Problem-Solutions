/*
Peter Georgas
12/24/2019

###########################################################################################################################

LeetCode Problem [MEDIUM] (https://leetcode.com/problems/linked-list-cycle-ii/):

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:

Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.

###########################################################################################################################

*/

import java.util.ArrayList;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
 }
public class LinkedListCycleII
{
    public static void main(String[] args)
    {
        // Test Code:
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode((-4));
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        System.out.println("Tail connects to: " + detectCycle(a).val);
    }
    public static ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> track = new ArrayList<>(); // Use this to keep track of the elements we've already seen

        ListNode current = head; // Use this to iterate through the singly-linked list

        while(current != null && !track.contains(current)) // As long as the current node is not null and we haven't already seen the node
        {
            track.add(current); // Add it to the list
            current = current.next; // Go to the next link
        }

        return current; // Return whatever we end on.
    }
}
