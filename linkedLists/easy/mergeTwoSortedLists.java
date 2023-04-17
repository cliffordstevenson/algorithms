// 21. Merge Two Sorted Lists
// Easy
// 17.9K
// 1.7K
// Companies
// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

 

// Example 1:


// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]
 

// Constraints:

// The number of nodes in both lists is in the range [0, 50].
// -100 <= Node.val <= 100
// Both list1 and list2 are sorted in non-decreasing order.

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // head becomes a ListNode with value -1
        // that ListNode by default points to null
        ListNode dummy = new ListNode(-1);
        // we need to give this dummy node a new title of head
        // because if we don't do this, at the end, we will return dummy.next
        // which will include the dummy node with value -1
        ListNode head = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                // This makes the dummy node point to the next node
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            // This moves the dummy pointer to the node that
            // was just added to the list
            // This makes dummy have the newly added node
            // that was just stitched to the new list
            dummy = dummy.next;
        }

        // This catches the remaining nodes of the longer list
        // These lists are already sorted, so we can just stitch them
        if(l1 != null) {
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }
        // finally we return head.next because dummy.next would include the dummy node
        // head.next returns the actual head, and it's remaining nodes,
        // but not the dummy node
        return head.next;
    }
}