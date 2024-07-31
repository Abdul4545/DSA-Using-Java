// package Linked_List;

// public class EvenOddNodes {

//     static Node oddEvenNodes(Node head) {

//         Node evenList = new Node(0);
//         Node oddList = new Node(0);

//         Node temp = head;
//         Node tempe = evenList;
//         Node tempo = oddList;

//         while (temp != null) {

//             if(temp.data % 2 == 0) {
//                 tempe = temp;
//                 tempe.nextNode = temp.nextNode;
//                 temp = temp.nextNode;
//             }

//             else {
//                 tempo = temp;
//                 tempo.nextNode = temp.nextNode;
//                 temp = temp.nextNode;
//             }  
//         }


//     }
    

//     public static void main(String[] args) {
        
//         Node a = new Node(2);
//         Node b = new Node(5);
//         Node c = new Node(8);
//         Node d = new Node(11);
//         Node e = new Node(16);

//         a.nextNode = b;
//         b.nextNode = c;
//         c.nextNode = d;
//         d.nextNode = e;
//     }
// }

// class Node {
//     int data;
//     Node nextNode;

//     Node(int data) {
//         this.data = data;
//         this.nextNode = null; 
//     }
// }
