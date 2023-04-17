// Reverse Linked List

// Given the head of a singly linked list, reverse the list, and return the reversed list.

 

// Example 1:


// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// Example 2:


// Input: head = [1,2]
// Output: [2,1]
// Example 3:

// Input: head = []
// Output: []
 

// Constraints:

// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000
 

// Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        // putting pre = null here makes it a ListNode object. 
        ListNode cur = head, pre = null;

        while(cur != null) {
            ListNode temp = cur.next;
            // cur.next is a ListNode object, it does not represent a value or a node. It refers to pointing at the next node of cur
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        // we return pre because it points to the head of the new reversed linked list
        return pre;
    }
}
