public class AVL_Tree {

    // for every node in the tree the difference in height of left and right sub tree of that node, <= 1 (Balanced Tree)

    // the solution is self balancing binary tree
    // example : AVL (Adelson-Velskii and Landis)

    // Algorith
    // 1) Insert normally node n
    // 2) find the node that makes the tree unbalanced, bottom up
    // 3) using one of the 4 rules rotate

        //             P

        //     C               t3

        // t1      t2


    // four rules
    // P - parent, C - child, G - grandchild

    // 1) P ----> C(left) ----> G(left)
    // use right rotation on P

            //         C 

            // t1              P 

            //             t2      t3



    // 2) P ----> C(left) ----> G(right)
    // use left rotation on C and then use right rotation on P



    // 3) P ----> C(right) ----> G(right)
    // use left rotation on P



    // 4) P ----> C(right) ----> G(left)
    // use right rotation on C and then use left rotation on P


    // implementation

    public class Node {

        private int value;
        private Node left;
        private Node right;
        private int height;
        
        public Node(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL_Tree() {

    }


    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if(node == null) {
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }


    // inserting nodes
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {

        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.value) {
            node.left = insert(node.left, value);
        }
    
        if(value > node.value) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {

        if(height(node.left) - height(node.right) > 1) {
            // left heavy
            if(height(node.left.left) - height(node.left.right) > 0) {
                // left left case
                return rightRotate(node);
            }

            if(height(node.left.left) - height(node.left.right) < 0) {
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1) {
            // right heavy
            if(height(node.right.left) - height(node.right.right) < 0) {
                // right right case
                return leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right) > 0) {
                // right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node c) {

        Node p = c.right;
        Node t = p.left; 

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    private Node rightRotate(Node p) {

        Node c = p.left;
        Node t = c.right; 

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    public boolean balanced() {
        return balanced(root);
    }


    private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
 

    public void display() {
        display(this.root, "Root node : ");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Left Child of " + node.value + ":");

        display(node.right, "Right Child of " + node.value + ":");
    }


    public void populate(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int nums[]) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int nums[], int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = (start + end)/2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);

    }


    public static void main(String[] args) {

        AVL_Tree tree = new AVL_Tree();

        for(int i = 0; i < 100; i++) {
            tree.insert(i);
        }

        tree.display();

        System.out.println(tree.height());
    }
}
