package Linked_List;

public class PalindromeList {

    public static Node reverseList(Node head) {
        Node current = head;
		Node previous = null;
		Node Next = null;

		while(current != null) {
			Next = current.nextNode;
			current.nextNode = previous;
			previous = current;
			current = Next;
		}

		return previous;
    }

    static boolean isPalindrome(Node head) {

        Node slow = head;
		Node fast = head;

		if(head == null || head.nextNode == null) {
			return true;
		}

		while(fast.nextNode != null && fast.nextNode.nextNode != null) {
			slow = slow.nextNode;
			fast = fast.nextNode.nextNode;
		}


		Node temp = reverseList(slow.nextNode);
		slow.nextNode = temp;

		Node p1 = head;
		Node p2 = slow.nextNode;

		while(p2 != null) {
			if(p1.data != p2.data) {
				return false;
			}

			p1 = p1.nextNode;
			p2 = p2.nextNode;
		}

		return true;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(12);
        Node c = new Node(13);
        Node d = new Node(12);
        Node e = new Node(1);
        Node f = new Node(0);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;

        System.out.println(isPalindrome(a));
        
    }
    
}
