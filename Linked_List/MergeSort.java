package Linked_List;


// https://leetcode.com/problems/sort-list/
public class MergeSort {

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode midPrev = middleNode(head);
        ListNode mid = midPrev.next;
        midPrev.next = null;  // Split the list into two halves

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    static ListNode merge(ListNode List1, ListNode List2) {
        ListNode t1 = List1;
        ListNode t2 = List2;

        ListNode h = new ListNode(0);
        ListNode t = h;

        while (t1 != null && t2 != null) {

            if(t1.data < t2.data) {
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }

            else {
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }

        if(t1 == null) {
            t.next = t2;
        }

        else {
            t.next = t1;
        }

        return h.next;
    }


    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow; 
    }


    
}
