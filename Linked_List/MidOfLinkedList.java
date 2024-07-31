package Linked_List;

public class MidOfLinkedList {

    // public static ListNode middleNode(ListNode head) {

    //     ListNode slow = head;
    //     ListNode fast = head;

    //     while(fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     return slow; 
    // }

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow; 
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(8);
        ListNode b = new ListNode(12);
        ListNode c = new ListNode(11);
        ListNode d = new ListNode(15);
        ListNode e = new ListNode(81);
        ListNode f = new ListNode(42);
        ListNode g = new ListNode(51);
        ListNode h = new ListNode(24);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        
        ListNode ans1= middleNode(a);
        System.out.println(ans1.data);

        ListNode ans2 = middleNode(d);
        System.out.println(ans2.data);
    }
    
}

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
