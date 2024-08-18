package Linked_List;

// https://leetcode.com/problems/reorder-list/

// logic: find mid of linklist, reverse 2nd hald and then connect elements from 1st half to 2nd half 

public class ReOrder {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow; 
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
		ListNode previous = null;
		ListNode Next = null;

		while(current != null) {
			Next = current.next;
			current.next = previous;
			previous = current;
			current = Next;
		}

		return previous;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode firstHead = head;

        while (firstHead != null && secondHead != null) {
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
            
        }

        if(firstHead != null) {
            firstHead.next = null;
        }

    }
    
}
