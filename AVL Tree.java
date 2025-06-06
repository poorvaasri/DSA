class Node {
    int val;
    int ht;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.ht = 1;
        this.left = null;
        this.right = null;
    }
}

class AVL {
    int getHeight(Node node) {
        return node == null ? 0 : node.ht;
    }

    int getBalance(Node node) {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        
        x.right = y;
        y.left = T2;

        
        y.ht = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
        x.ht = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        
        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;


        y.left = x;
        x.right = T2;

        
        x.ht = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
        y.ht = Math.max(getHeight(y.left), getHeight(y.right)) + 1;

        
        return y;
    }

    Node insert(Node node, int val) {
        
        if (node == null)
            return new Node(val);

        if (val < node.val)
            node.left = insert(node.left, val);
        else if (val > node.val)
            node.right = insert(node.right, val);
        else
            return node; 

        
        node.ht = 1 + Math.max(getHeight(node.left), getHeight(node.right));

       
        int balance = getBalance(node);

        
        if (balance > 1 && val < node.left.val) 
            return rightRotate(node);

        if (balance < -1 && val > node.right.val) 
            return leftRotate(node);

        if (balance > 1 && val > node.left.val) { 
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && val < node.right.val) { 
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; 
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }

    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.val + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();
        Node root = null;
        int[] values = {20, 30, 25, 47, 67, 90, 33, 89};

        for (int val : values) {
            root = tree.insert(root, val);
        }

        System.out.println("Inorder traversal:");
        tree.inorder(root);
        System.out.println("\nPreorder traversal:");
        tree.preorder(root);
        System.out.println("\nPostorder traversal:");
        tree.postorder(root);
    }
}
